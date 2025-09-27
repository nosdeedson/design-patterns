package br.com.E3N.backPressure;

import reactor.core.publisher.Flux;

import java.time.Duration;

public class Publisher {
    public static Flux<Integer> publish(int start, int count, int delay){
        return Flux.range(start, count)
                .delayElements(Duration.ofMillis(delay)).log();
    }
}
