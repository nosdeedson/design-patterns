package br.com.E3N.builder;

public class Main {

    public static void main(String[] args) {
        var hero1 = Hero.build();
        System.out.println(hero1);
        var hero2 = Hero.build()
                .withProfession("report");
        System.out.println(hero2);
        var hero3 = Hero.build()
                .withProfession("programmer")
                .withHairColor("gray");
        System.out.println(hero3);
        var hero4 = Hero.build()
                .withProfession("report")
                .withHairColor("green")
                .withArmor("do not know")
                .withWeapon("gun")
                .withName("super any")
                .withHairType("long");
        System.out.println(hero4);
    }
}
