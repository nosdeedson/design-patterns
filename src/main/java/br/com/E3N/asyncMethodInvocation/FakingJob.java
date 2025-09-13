package br.com.E3N.asyncMethodInvocation;

import java.util.function.BinaryOperator;

public class FakingJob<T> {

    private final BinaryOperator<T> resolver;

    public FakingJob(BinaryOperator<T> resolver) {
        this.resolver = resolver;
    }

    private T resolve(T a, T b){
        return resolver.apply(a, b);
    }

    public T fakingJob(T any){
        T resolving = any;
        for (int i = 1; i < 100_000; i++) {
            resolving = resolve(resolving, any);
        }
        return resolving;
    }
}
