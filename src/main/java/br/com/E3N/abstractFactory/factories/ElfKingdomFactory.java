package br.com.E3N.abstractFactory.factories;

import br.com.E3N.abstractFactory.elf.ElfArmy;
import br.com.E3N.abstractFactory.elf.ElfCastle;
import br.com.E3N.abstractFactory.elf.ElfKing;
import br.com.E3N.abstractFactory.service.Army;
import br.com.E3N.abstractFactory.service.Castle;
import br.com.E3N.abstractFactory.service.King;

public class ElfKingdomFactory implements KingdomFactory {

    public ElfKingdomFactory() {
    }

    @Override
    public Army createArmy() {
        return new ElfArmy();
    }

    @Override
    public Castle createCastle() {
        return new ElfCastle();
    }

    @Override
    public King createKing() {
        return new ElfKing();
    }
}
