package br.com.E3N.builder;

public class Hero {

    private String profession;
    private String name;
    private String hairType;
    private String hairColor;
    private String armor;
    private String weapon;

    private Hero() {
    }

    public static Hero build(){
        return new Hero();
    }

    public Hero withProfession(String profession) {
        this.profession = profession;
        return this;
    }

    public Hero withName(String name) {
        this.name = name;
        return this;
    }

    public Hero withHairType(String hairType) {
        this.hairType = hairType;
        return this;
    }

    public Hero withHairColor(String hairColor) {
        this.hairColor = hairColor;
        return this;
    }

    public Hero withArmor(String armor) {
        this.armor = armor;
        return this;
    }

    public Hero withWeapon(String weapon) {
        this.weapon = weapon;
        return this;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "profession='" + profession + '\'' +
                ", name='" + name + '\'' +
                ", hairType='" + hairType + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", armor='" + armor + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
