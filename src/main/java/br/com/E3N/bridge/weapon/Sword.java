package br.com.E3N.bridge.weapon;

import br.com.E3N.bridge.enchantment.Enchantment;

public class Sword implements Weapon {

    private final Enchantment enchantment;

    public Sword(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        System.out.println("This sword is wielded");
        this.enchantment.onActivate();
    }

    @Override
    public void swing() {
        System.out.println("This sword is swung");
        this.enchantment.apply();
    }

    @Override
    public void unWield() {
        System.out.println("This sword is unwielded");
        this.enchantment.onDeactivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return this.enchantment;
    }
}
