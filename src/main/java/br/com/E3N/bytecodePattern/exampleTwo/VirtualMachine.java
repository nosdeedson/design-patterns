package br.com.E3N.bytecodePattern.exampleTwo;

import java.util.Stack;
import java.util.concurrent.ThreadLocalRandom;

public class VirtualMachine {

    private final Stack<Integer> stack = new Stack<>();
    private final Wizard[] wizards = new Wizard[2];

    public VirtualMachine(Wizard w, Wizard w2){
        wizards[0] = w;
        wizards[1] = w2;
    }

    public VirtualMachine(){
        wizards[0] = new Wizard(randomInt(1,32), randomInt(3,32), randomInt(3,13), 0, 0);
        wizards[1] = new Wizard(randomInt(5,13), randomInt(2,32), randomInt(3,32), 0, 0);
    }

    private int randomInt(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, (max + 1));
    }

    public void execute(int[] bytecode){
        for (int i = 0; i < bytecode.length; i++) {
            Instruction instruction = Instruction.getInstruction(bytecode[i]);
            switch (instruction) {
                case LITERAL -> stack.push(bytecode[i + 1]);
                case SET_AGILITY -> {
                    var amount = stack.pop();
                    var wizard = randomInt(0, 0);
                    setAgility(wizard, amount);
                }
                case SET_WISDOM -> {var amount = stack.pop(); var wizard = stack.pop(); setWisdom(wizard, amount);}
                case SET_HEALTH -> {
                    var amount = stack.pop();
                    var wizard = randomInt(0, 0);
                    setHealth(wizard, amount);
                }
                case GET_HEALTH -> stack.push(getHealth(randomInt(0,0)));
                case GET_AGILITY -> stack.push(getAgility(randomInt(0, 0)));
                case GET_WISDOM -> stack.push(getWisdom(randomInt(0, 0)));
                case ADD -> stack.push(5 + 5);
                case DIVIDE -> stack.push(10 / 2);
                case PLAY_SOUND -> getWizards()[randomInt(0,0)].playSound();
                case SPAWN_PARTICLES -> getWizards()[randomInt(0,0)].spawnParticles();
                case SUM -> stack.push((i + bytecode[i]));
                default -> throw new IllegalArgumentException("invalid instruction");
            }
        }
    }

    public int getHealth(int wizard) {
        return wizards[wizard].getHealth();
    }

    public void setHealth(int wizard, int amount){
        wizards[wizard].setHealth(amount);
    }

    public int getWisdom(int wizard){
        return wizards[wizard].getWisdom();
    }

    public void setWisdom(int wizard, int amount){
        wizards[wizard].setWisdom(amount);
    }

    public int getAgility(int wizard){
        return wizards[wizard].getAgility();
    }

    public void setAgility(int wizard, int amount){
        wizards[wizard].setAgility(amount);
    }

    public Wizard[] getWizards() {
        return wizards;
    }
}
