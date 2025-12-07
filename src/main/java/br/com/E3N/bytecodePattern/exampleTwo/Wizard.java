package br.com.E3N.bytecodePattern.exampleTwo;

public class Wizard {

    private int health;
    private int agility;
    private int wisdom;
    private int numberOfPlayedSounds;
    private int numberOfSpawnedParticles;

    public void playSound(){
        System.out.println("Playing sound");
        numberOfPlayedSounds++;
    }

    public void spawnParticles(){
        System.out.println("Spawning particles");
        numberOfSpawnedParticles++;
    }

    public Wizard(int health, int agility, int wisdom, int numberOfPlayedSounds, int numberOfSpawnedParticles) {
        this.health = health;
        this.agility = agility;
        this.wisdom = wisdom;
        this.numberOfPlayedSounds = numberOfPlayedSounds;
        this.numberOfSpawnedParticles = numberOfSpawnedParticles;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getNumberOfPlayedSounds() {
        return numberOfPlayedSounds;
    }

    public void setNumberOfPlayedSounds(int numberOfPlayedSounds) {
        this.numberOfPlayedSounds = numberOfPlayedSounds;
    }

    public int getNumberOfSpawnedParticles() {
        return numberOfSpawnedParticles;
    }

    public void setNumberOfSpawnedParticles(int numberOfSpawnedParticles) {
        this.numberOfSpawnedParticles = numberOfSpawnedParticles;
    }
}
