package br.com.E3N.abstractFactory.elf;

import br.com.E3N.abstractFactory.service.King;

public class ElfKing implements King {
    @Override
    public String getDescription() {
        return "Elf King";
    }
}
