package br.com.E3N.bridge.enchantment;

public class FlyingEnchantment implements Enchantment{

    @Override
    public void onActivate() {
        System.out.println("The object starts to glow faintly.");
    }

    @Override
    public void apply() {
        System.out.println("The object flies and strikes the enemies finally returning to the owner's hand. ");
    }

    @Override
    public void onDeactivate() {
        System.out.println("The object's glow fades.");
    }
}
