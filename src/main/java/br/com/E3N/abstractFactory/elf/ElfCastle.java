package br.com.E3N.abstractFactory.elf;

import br.com.E3N.abstractFactory.service.Castle;

public class ElfCastle implements Castle {
    @Override
    public String getDescription() {
        return "Elf Castle";
    }
}
