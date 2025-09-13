package br.com.E3N.asyncMethodInvocation;

import java.util.concurrent.*;
import java.util.function.Consumer;

public class AsyncExecutor {

    /**
     * This class is asynchronous if called submit
     * in other words the program will continue working doing another things
     */

    private  final ExecutorService executorService;

    public AsyncExecutor(int poolSize){
        this.executorService = Executors.newFixedThreadPool(poolSize);
    }

    /**
     * If this method is called it is not to get the return value without the await method
     * We use it when we want to wait
     * @param task
     * @return
     * @param <T>
     */
    public <T> AsyncResult<T> submit(Callable<T> task){
        CompletableFuture<T> future = CompletableFuture.supplyAsync(() ->{
           try {
               return task.call();
           } catch (Exception e) {
               throw new CompletionException(e);
           }
        }, executorService);
        return new AsyncResult<>(future);
    }

    /**
     * With this method the process will be asynchronous
     * and if we want to manipulate the return value we have to pass the consumer function to it
     * @param task
     * @param onSuccess
     * @param onFailure
     * @return
     * @param <T>
     */
    public <T> AsyncResult<T> submit(Callable<T> task, Consumer<T> onSuccess, Consumer<Throwable> onFailure){
        CompletableFuture<T> future = CompletableFuture.supplyAsync(() -> {
            try {
                return task.call();
            } catch (Exception e) {
                throw new CompletionException(e);
            }
        }, executorService);

        future.thenAccept(onSuccess)
                .exceptionally(ex -> {onFailure.accept(ex.getCause()); return  null;});

        return new AsyncResult<>(future);
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
