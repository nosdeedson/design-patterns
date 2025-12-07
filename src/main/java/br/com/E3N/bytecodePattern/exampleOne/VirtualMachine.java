package br.com.E3N.bytecodePattern.exampleOne;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class VirtualMachine {

    private final Deque<Integer> stack = new ArrayDeque<>();
    private final Map<Integer, Instruction> instructionSet;

    private int health = 100;
    private int agility = 10;
    private int wisdom = 5;

    public VirtualMachine(Map<Integer, Instruction> instructionSet) {
        this.instructionSet = instructionSet;
    }

    public void push(int value){
        stack.push(value);
    }

    public int pop(){
        return stack.pop();
    }

    public int peek(){
        return stack.peek();
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

    public void run(int[] bytecode){
        for (int opcode: bytecode){
            Instruction instruction = instructionSet.get(opcode);
            if (instruction == null){
                throw new IllegalArgumentException("unknow opcode " + opcode);
            }
            instruction.execute(this);
        }
    }
}
