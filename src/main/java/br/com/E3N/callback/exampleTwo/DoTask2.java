package br.com.E3N.callback.exampleTwo;

public class DoTask2 {
    public static void execute(){
        Task task1 = new SimpleTask();
        task1.executeWith(() -> {
            System.out.println("Thanks for notifying me. Do this, please.");
            int total = 5 + 3;
            System.out.printf("The result is %d", total);
        });
    }
}
