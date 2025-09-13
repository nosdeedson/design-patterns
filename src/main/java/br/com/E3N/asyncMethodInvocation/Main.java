package br.com.E3N.asyncMethodInvocation;

import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        App.execute(8);

        for (int i = 0; i <= 100; i++) {
            if(i == 100) System.out.println("while waiting, I finish first.");
        }
    }
}
