package br.com.E3N.bridge;

import br.com.E3N.bridge.enchantment.FlyingEnchantment;
import br.com.E3N.bridge.enchantment.SoulEatingEnchantment;
import br.com.E3N.bridge.weapon.Hammer;
import br.com.E3N.bridge.weapon.Sword;
import br.com.E3N.bridge.weapon.Weapon;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* The purpose of the Bridge Pattern is to determine in runtime the king of enchantment
            a weapon can have
         */
//        System.out.println("Choose an enchantment: ");
//        System.out.println("Flying Enchantment or Soul Eating.");
//        Scanner scanner = new Scanner(System.in);

        final String swordEnchantment = JOptionPane.showInputDialog(null, "Type the enchantment: Soul Eating or Flying Enchantment");

        Weapon weapon1;
        Weapon weapon2;
        if (swordEnchantment.equals("Flying Enchantment")) {
            weapon1 = new Sword(new FlyingEnchantment());
            weapon2 = new Hammer(new SoulEatingEnchantment());
        } else {
            weapon1 = new Hammer(new SoulEatingEnchantment());
            weapon2 = new Sword(new FlyingEnchantment());
        }
        weapon1.wield();
        weapon1.swing();
        weapon1.unWield();

        weapon2.wield();
        weapon2.swing();
        weapon2.unWield();

        System.out.printf("The weapon1 has the enchantment: %s. %n", weapon1.getEnchantment().getTypeEnchantment());
        System.out.printf("The weapon2 has the enchantment: %s. %n ", weapon2.getEnchantment().getTypeEnchantment());
    }
}
