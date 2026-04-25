package br.com.E3N.builder.version3;

public class Main {

    public static void main(String[] args) {
        Pizza nyPizza = new NyPizza
                .Builder(NyPizza.Size.LARGE)
                .addTopping(Pizza.Topping.HAM)
                .build();
        System.out.println(nyPizza);
        Pizza nyPizza2 = new NyPizza
                .Builder(NyPizza.Size.MEDIUM).build();
        System.out.println(nyPizza2);
        Pizza calzone = new Calzone
                .Builder()
                .sauceInside()
                .addTopping(Pizza.Topping.ONION)
                .build();
        System.out.println(calzone);
        Pizza calzone2 = new Calzone
                .Builder()
                .build();
        System.out.println(calzone2);
    }
}
