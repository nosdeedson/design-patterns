package br.com.E3N.bridge.enchantment;

public class SoulEatingEnchantment implements Enchantment{
    @Override
    public void onActivate() {
        System.out.println("The object spreads bloodlust.");
    }

    @Override
    public void apply() {
        System.out.println("The object eats the soul of enemies.");
    }

    @Override
    public void onDeactivate() {
        System.out.println("Bloodlust slowly disappears.");
    }
}
