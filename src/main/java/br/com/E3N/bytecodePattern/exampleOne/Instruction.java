package br.com.E3N.bytecodePattern.exampleOne;

@FunctionalInterface
public interface Instruction {
    void execute(VirtualMachine vm);
}
