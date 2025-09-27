package br.com.E3N.backPressure;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;
import reactor.util.annotation.NonNull;

public class Subscriber extends BaseSubscriber<Integer> {

    @Override
    protected void hookOnSubscribe(@NonNull Subscription subscription){
        System.out.println("subscribe()");
        request(10);
    }

    @Override
    protected void hookOnNext(@NonNull Integer value){
        processItem();
        if( (value % 5 == 0 && value > 9)   ){
            System.out.println(value);
            request(5);
        }
    }

    @Override
    protected void  hookOnComplete(){
        System.out.println("Finished");
    }

    private void processItem(){
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}
