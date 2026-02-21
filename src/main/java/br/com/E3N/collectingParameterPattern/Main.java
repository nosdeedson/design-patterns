package br.com.E3N.collectingParameterPattern;

public class Main {

    /*
    * The collecting parameter pattern is a pattern where methods will share a list (or object) to hold the result of each method
    * instead of creating a list to receive the results individually we create a variable that will be passed to
    * all methods that contribute to the computation of something.
    * And this list can be a parameter
    * */
    public static void main(String[] args) {
        App.execute();
    }
}
