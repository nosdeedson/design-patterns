package br.com.E3N.callback.exampleFour;

import java.io.IOException;

public final class DoTask4 {

    public static void execute() throws IOException, InterruptedException {
        var task4 = new Task();
        var result = task4.executeWith(String::toUpperCase);
        System.out.println(result);
    }
}
