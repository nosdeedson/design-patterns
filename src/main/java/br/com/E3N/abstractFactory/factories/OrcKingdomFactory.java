package br.com.E3N.abstractFactory.factories;

import br.com.E3N.abstractFactory.ork.OrkArmy;
import br.com.E3N.abstractFactory.ork.OrkCastle;
import br.com.E3N.abstractFactory.ork.OrkKing;
import br.com.E3N.abstractFactory.service.Army;
import br.com.E3N.abstractFactory.service.Castle;
import br.com.E3N.abstractFactory.service.King;

public class OrcKingdomFactory implements KingdomFactory {

    public OrcKingdomFactory() {
    }

    @Override
    public Army createArmy() {
        return new OrkArmy();
    }

    @Override
    public Castle createCastle() {
        return new OrkCastle();
    }

    @Override
    public King createKing() {
        return new OrkKing();
    }
}
