package br.com.E3N.asyncMethodInvocation;

import java.util.concurrent.ExecutionException;

public class App {


    public static void execute(final int poolSize) throws ExecutionException, InterruptedException {

        var fakeJob = new FakingJob<Integer>(Integer::sum);
        AsyncExecutor executor = new AsyncExecutor(poolSize);

        AsyncResult<Integer> result = executor.submit(() -> fakeJob.fakingJob(1));

        System.out.println("waiting for result");
        Integer value = result.await();
        System.out.println("Result: " + value);

        var fakeJobWithString = new FakingJob<String>(String::concat);
        executor.submit(() -> {
                    return fakeJobWithString.fakingJob("waiting : ");
                },
                System.out::println,
                System.out::println
        );
        executor.shutdown();
    }
}
