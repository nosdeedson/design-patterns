package br.com.E3N.asyncMethodInvocation;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class AsyncResult<T>{
    private final CompletableFuture<T> future;

    AsyncResult(CompletableFuture<T> future) {
        this.future = future;
    }

    public boolean isCompleted(){
        return future.isDone();
    }

    /**
     * this method await the ending of the process
     * @return
     * @throws InterruptedException
     * @throws ExecutionException
     */
    public T await() throws  InterruptedException, ExecutionException{
        return future.get();
    }

    /**
     * this method await the ending of the process
     * @param timeout
     * @param unit
     * @return
     * @throws InterruptedException
     * @throws TimeoutException
     * @throws ExecutionException
     */
    public T await(long timeout, TimeUnit unit) throws InterruptedException, TimeoutException, ExecutionException {
        return future.get(timeout, unit);
    }
}
