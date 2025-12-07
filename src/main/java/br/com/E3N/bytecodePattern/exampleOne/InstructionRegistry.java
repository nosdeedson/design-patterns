package br.com.E3N.bytecodePattern.exampleOne;

import java.util.Map;

public class InstructionRegistry {

    public static final int PUSH_10    = 1;
    public static final int PUSH_20    = 2;
    public static final int ADD        = 3;
    public static final int DIV        = 4;
    public static final int SET_HEALTH = 5;

    public static Map<Integer, Instruction> defaultInstructionSet(){
        return Map.of(
                PUSH_10,  vm -> vm.push(10),
                PUSH_20, vm -> vm.push(20),
                ADD, vm -> vm.push(vm.pop() + vm.pop()),
                DIV, vm -> {
                    int b = vm.pop();
                    int a = vm.pop();
                    vm.push(a / b);
                },
                SET_HEALTH, vm -> vm.setHealth(vm.pop())
        );

    }
}
