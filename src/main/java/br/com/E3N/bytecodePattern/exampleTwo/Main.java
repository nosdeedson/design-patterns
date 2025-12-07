package br.com.E3N.bytecodePattern.exampleTwo;

public class Main {

    public static void main(String[] args) {

        var vm = new VirtualMachine(
                new Wizard(45, 7, 11, 0, 0),
                new Wizard(36, 18, 8, 0, 0));

        int[] instructions = {
                1,
                1,
                2,
                1,
                8,
                1,
                7,
                10,
                1,
                11,
                10,
                7,
                5,
                6
        };

        vm.execute(instructions);
    }
}
