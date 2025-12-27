package br.com.E3N.callback.exampleTwo;

import java.util.Optional;

public abstract class Task {

    public final void executeWith(Runnable runnable){
        execute();
        Optional.ofNullable(runnable).ifPresent(Runnable::run);
    }

    protected abstract void execute();
}
