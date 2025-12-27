package br.com.E3N.callback.exampleThree;

public class DoTask3 {
    public static void execute() {
        Task<Integer> task2 = new CalculationTask();
        task2.executeWith(result -> System.out.println("Call back received " + result));

        br.com.E3N.callback.exampleThree.Task<String> task3 = new ConcatenationTask();
        task3.executeWith(System.out::println);
    }
}
