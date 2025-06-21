package br.com.E3N.abstractFactory.factories;

import br.com.E3N.abstractFactory.enums.KingdomType;

public class FactoryMaker {

    public FactoryMaker() {
    }

    public KingdomFactory makerFactory(final KingdomType type){
        if (type.equals(KingdomType.ELF)){
            return new ElfKingdomFactory();
        }
        return  new OrcKingdomFactory();
    }
}
