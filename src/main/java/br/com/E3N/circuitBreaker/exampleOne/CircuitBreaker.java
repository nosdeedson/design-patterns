package br.com.E3N.circuitBreaker.exampleOne;

public class CircuitBreaker {

    private final int failureThreshold;
    private final long retryTimePeriod;
    private State state = State.CLOSED;
    private int failureCount = 0;
    private long lastFailureTime = 0;

    public CircuitBreaker(int failureThreshold, long retryTimePeriod) {
        this.failureThreshold = failureThreshold;
        this.retryTimePeriod = retryTimePeriod;
    }

    public synchronized <T> T call(ServiceCall<T> serviceCall, T fallBack) throws InterruptedException {
        if (state == State.OPEN) {
            if (System.currentTimeMillis() - lastFailureTime > retryTimePeriod) {
                state = State.HALF_OPEN;
            } else {
                return fallBack; // still in open period, in other words failing
            }
        }
        try {
            T result = serviceCall.execute();
            if ("REQUEST FAILED".equals(result)){
                throw new RuntimeException("Error simulated");
            }
            reset();
            return result;
        } catch (Exception e) {
            recordFailure();
            return fallBack;
        }
    }

    private void reset() {
        failureCount = 0;
        state = State.CLOSED;
    }

    private void recordFailure() {
        failureCount++;
        if (failureCount >= failureThreshold) {
            state = State.OPEN;
            lastFailureTime = System.currentTimeMillis();
        }
    }

    public State getState() {
        return this.state;
    }
}
