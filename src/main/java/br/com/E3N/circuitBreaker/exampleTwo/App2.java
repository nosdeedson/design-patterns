package br.com.E3N.circuitBreaker.exampleTwo;

import br.com.E3N.shared.RemoteService;
import br.com.E3N.shared.RemoteServiceInterface;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;

import java.util.function.Supplier;

public class App2 {

    public static void execute() throws InterruptedException {
        var remoteService = new FakeRemoteService();
        CircuitBreakerRegistry registry =
                CircuitBreakerRegistry.of(CircuitBreakerConfigFactory.createConfig());

        CircuitBreaker cb = registry.circuitBreaker("remoteServiceCB");

        for (int i = 0; i < 10; i++) {
            int timeout = ( i + 1 ) * 200;
            int idToRequestFromAPI = (i + 1);
            Supplier<String> supplier = () -> remoteService.fetchData(idToRequestFromAPI, timeout, true);

            Supplier<String> decoratedSupplier =
                    CircuitBreaker.decorateSupplier(cb, supplier);
            try {
                String result = decoratedSupplier.get();
                System.out.printf(
                        "Attempt %d -> SUCCESS | result='%s' | state=%s%n",
                        i,
                        result,
                        cb.getState()
                );
            } catch (Exception e) {
                System.out.printf(
                        "Attempt %d -> FAILURE | error='%s' | state=%s%n",
                        i,
                        e.getMessage(),
                        cb.getState()
                );
            }
            Thread.sleep(1000);
        }
    }
}
