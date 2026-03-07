package br.com.E3N.combinatorPattern.v1;

import java.util.Arrays;

public class Combinator {

    private static final String TEXT = """
            It was many and many a year ago,
            In a kingdom by the sea,
            That a maiden there lived whom you may know
            By the name of ANNABEL LEE;
            And this maiden she lived with no other thought
            Than to love and be loved by me.
            I was a child and she was a child,
            In this kingdom by the sea;
            But we loved with a love that was more than love-
            I and my Annabel Lee;
            With a love that the winged seraphs of heaven
            Coveted her and me.""";

    public static void execute(){
        var queriesOr = new String[]{"many", "Annabel"};
        var finder = Finders.expandedFinder(queriesOr);
        var res = finder.find(text());
        System.out.println("The result of expanded or");
        System.out.println("query: " + Arrays.toString(queriesOr) + " result: " + res);

        var queriesAnd = new String[]{"Annabel", "my"};
        finder = Finders.specializedFinder(queriesAnd);

        res = finder.find(text());
        System.out.println("The result of specialized and ");
        System.out.println("query: " + Arrays.toString(queriesAnd) + " result: " + res);

        finder = Finders.advancedFinder("it was", "kingdom", "sea");
        res = finder.find(text());
        System.out.println("The resul of advancedFilter");
        System.out.println(res);

        finder = Finders.filteredFinder(" was ", "many", "child");
        res = finder.find(text());
        System.out.println("The result of filteredFinder");
        System.out.println(res);
    }

    private static String text(){
        return TEXT;
    }

}
