package br.com.E3N.callback;

import br.com.E3N.callback.exampleFour.DoTask4;
import br.com.E3N.callback.exampleOne.DoTask1;
import br.com.E3N.callback.exampleThree.DoTask3;
import br.com.E3N.callback.exampleTwo.DoTask2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("EXAMPLE ONE");
        DoTask1.execute();

        System.out.println("EXAMPLE TWO");
        DoTask2.execute();

        System.out.println();
        System.out.println("EXAMPLE THREE");
        DoTask3.execute();

        System.out.println("EXAMPLE FOUR.");
        DoTask4.execute();

    }
}
