package br.com.E3N.circuitBreaker.exampleOne;

public class App {

    public static void execute(final int failureThreshold, final int retryTimePeriod) throws Exception {
        FakeRemoteService remoteService = new FakeRemoteService();
        CircuitBreaker circuitBreaker = new CircuitBreaker(failureThreshold, retryTimePeriod);
        for (int i = 0; i < 10; i++) {
            int timeoutTime =  (i + 1) * 100;
            String result = circuitBreaker.call(
                    () -> remoteService.fetchData(timeoutTime),
                    "fallback response"
            );
            System.out.printf(
                    "Attempt %d: result='%s', circuit=%s%n",
                    i,
                    result,
                    circuitBreaker.getState()
            );

            // Wait a bit between calls
            Thread.sleep(1000);
        }

        System.out.println("Waiting 6s to allow retry...");
        Thread.sleep(6000);
        String retryResult = circuitBreaker.call(
                () -> remoteService.fetchData(1000),
                "Second fallback response"
        );

        System.out.printf(
                "After wait: result='%s', circuit=%s%n",
                retryResult,
                circuitBreaker.getState()
        );
    }
}
