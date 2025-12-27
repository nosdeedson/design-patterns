package br.com.E3N.callback.exampleTwo;

public class SimpleTask extends Task {

    @Override
    protected void execute() {
        System.out.println("I am doing a task. After I finish I will call you. Another task");
    }
}