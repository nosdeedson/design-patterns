package br.com.E3N.circuitBreaker.exampleTwo;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;

import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.http.HttpTimeoutException;
import java.time.Duration;

public class CircuitBreakerConfigFactory {

    public static CircuitBreakerConfig createConfig() {
        return CircuitBreakerConfig.custom()
                .failureRateThreshold(50) // percentage
                .minimumNumberOfCalls(1)
                .slidingWindowSize(1)
                .waitDurationInOpenState(Duration.ofSeconds(5))
                .permittedNumberOfCallsInHalfOpenState(1)
                .recordExceptions(
                        SocketTimeoutException.class,
                        ConnectException.class,
                        IOException.class,
                        InterruptedException.class,
                        RuntimeException.class
                )
                .build();
    }
}
