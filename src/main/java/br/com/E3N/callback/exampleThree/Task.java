package br.com.E3N.callback.exampleThree;

import java.util.function.Consumer;

public abstract class Task<T> {

    public final void executeWith(Consumer<T> callBack){
        T result = execute();
        if (callBack != null){
            callBack.accept(result);
        }
    }

    protected abstract T execute();
}
