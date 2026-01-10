package br.com.E3N.circuitBreaker;

import br.com.E3N.circuitBreaker.exampleOne.App;
import br.com.E3N.circuitBreaker.exampleTwo.App2;

/**
 * The circuit breaker works like an electric switch if closed pass, if open do not let pass
 * When the state is closed we can make a third part service request (for example)
 * if the state is open we return a callback (throw error unavailable) maybe informing the service is not available
 * when the state is half open we try some request if fail change the state to open
 * if succeed we change the state to closed again
 */
public class Main {
    public static void main(String[] args) throws Exception {
        int failureThreshold = 1;
        int retryTimePeriod = 3000;
//        App.execute(failureThreshold, retryTimePeriod);
//        System.out.println();
//        System.out.println();
//        System.out.println();
        System.out.println("USING RESILIENCE4J");
        App2.execute();
    }
}
