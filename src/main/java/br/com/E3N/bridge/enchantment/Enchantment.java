package br.com.E3N.bridge.enchantment;

public interface Enchantment {
    void onActivate();
    void apply();
    void onDeactivate();
    default String getTypeEnchantment(){
        return this.getClass().getSimpleName();
    }
}
