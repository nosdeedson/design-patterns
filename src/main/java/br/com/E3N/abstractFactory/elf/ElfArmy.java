package br.com.E3N.abstractFactory.elf;

import br.com.E3N.abstractFactory.service.Army;

public class ElfArmy implements Army {
    @Override
    public String getDescription() {
        return "Elf Army";
    }
}
