package br.com.E3N.combinatorPattern.v2;

public class Main {

    /**
     * The combinator pattern is similar with the builder pattern in a way
     * the builder help to create an object meanwhile the combinator allow you to add behavior to the object
     * The combinator pattern allow you to create a complex behavior by composing small functions that return
     * the same type, so you can do something like this object.validateThis().validateThat().validateSomething()
     * and receive the result.
     */
    public static void main(String[] args) {
        App.execute();
    }

}
