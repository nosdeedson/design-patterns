package br.com.E3N.bridge.weapon;

import br.com.E3N.bridge.enchantment.Enchantment;

public class Hammer implements Weapon {

    private final Enchantment enchantment;

    public Hammer(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        System.out.println("This hammer is wielded");
        this.enchantment.onActivate();
    }

    @Override
    public void swing() {
        System.out.println("This hammer is swung");
        this.enchantment.apply();
    }

    @Override
    public void unWield() {
        System.out.println("This hammer is unwielded");
        this.enchantment.onDeactivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return this.enchantment;
    }
}
