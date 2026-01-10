package br.com.E3N.circuitBreaker.exampleOne;

@FunctionalInterface
public interface ServiceCall<T> {
    T execute() throws Exception;
}
