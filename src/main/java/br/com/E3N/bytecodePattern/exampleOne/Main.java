package br.com.E3N.bytecodePattern.exampleOne;

public class Main {

    public static void main(String[] args) {
        VirtualMachine vm = new VirtualMachine(InstructionRegistry.defaultInstructionSet());

        int[] program = {
                InstructionRegistry.PUSH_20,
                InstructionRegistry.PUSH_10,
                InstructionRegistry.DIV,
                InstructionRegistry.SET_HEALTH
        };

        vm.run(program);

        System.out.println(vm.getAgility());
        System.out.println(vm.getWisdom());
        System.out.println(vm.getHealth());
    }
}
