package br.com.E3N.builder.version2;

public class Main {

    public static void main(String[] args) {

        NutritionFacts justRequiredAttributes = new NutritionFacts.Builder(34, 21).build();
        System.out.println(justRequiredAttributes);

        NutritionFacts someAttributes = new NutritionFacts.Builder(14, 32)
                .calories(10)
                .fat(5)
                .build();
        System.out.println(someAttributes);

        NutritionFacts allAttributes = new NutritionFacts.Builder(23, 45)
                .calories(10)
                .fat(2)
                .carboHydrate(3)
                .sodium(5)
                .build();
        System.out.println(allAttributes.toString());
    }
}
