package br.com.E3N.callback.exampleThree;

public class CalculationTask extends Task<Integer>{
    @Override
    protected Integer execute() {
        System.out.println("I am calculating...");
        return 10 + 12;
    }
}
