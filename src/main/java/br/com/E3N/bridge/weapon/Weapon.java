package br.com.E3N.bridge.weapon;

import br.com.E3N.bridge.enchantment.Enchantment;

public interface Weapon {
    void wield();
    void swing();
    void unWield();
    Enchantment getEnchantment();
}
