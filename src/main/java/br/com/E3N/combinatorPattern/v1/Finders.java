package br.com.E3N.combinatorPattern.v1;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Finders {

    private Finders() {
    }

    public static Finder advancedFinder(final String query, final String orQuery, final String notQuery) {
        return Finder.contains(query)
                .or(Finder.contains(orQuery))
                .not(Finder.contains(notQuery));
    }

    public static Finder filteredFinder(final String query, final String... excludeQueries) {
        var finder = Finder.contains(query);
        for (String q : excludeQueries) {
            finder = finder.not(Finder.contains(q));
        }
        return finder;
    }

    public static Finder specializedFinder(final String... queries) {
        var finder = identMult();
        for (String query : queries) {
            finder = finder.and(Finder.contains(query));
        }
        return finder;
    }

    public static Finder expandedFinder(String... queries) {
        var finder = identSum();
        for (String query : queries) {
            finder = finder.or(Finder.contains(query));
        }
        return finder;
    }

    public static Finder identMult() {
        return txt -> Stream.of(txt.split("\n"))
                .collect(Collectors.toList());
    }

    public static Finder identSum() {
        return txt -> new ArrayList<>();
    }
}
