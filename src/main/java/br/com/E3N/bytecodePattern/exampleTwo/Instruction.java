package br.com.E3N.bytecodePattern.exampleTwo;

import java.util.Arrays;

public enum Instruction {
    LITERAL(1),
    SET_HEALTH(2),
    SET_WISDOM(3),
    SET_AGILITY(4),
    PLAY_SOUND(5),
    SPAWN_PARTICLES(6),
    GET_HEALTH(7),
    GET_AGILITY(8),
    GET_WISDOM(9),
    ADD(10),
    DIVIDE(11),
    SUM(12),
    SUBTRACT(13);

    private final int value;

    private Instruction(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Instruction getInstruction(int value){
        return Arrays.stream(values()).filter(it -> it.getValue() == value).findFirst().orElse(null);
    }
}
