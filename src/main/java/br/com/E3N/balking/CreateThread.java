package br.com.E3N.balking;

import org.jspecify.annotations.NonNull;

import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class CreateThread {

    public static ThreadFactory createThreadFactory(final String nameOfThread){
        return new ThreadFactory(){
            private final AtomicInteger counter = new AtomicInteger(1);
            @Override
            public Thread newThread( @NonNull Runnable r) {
                Objects.requireNonNull(r, "Runnable cannot be null");
                Thread t = new Thread(r);
                t.setName(nameOfThread + counter.getAndIncrement());
                return t;
            }
        };
    }
}
