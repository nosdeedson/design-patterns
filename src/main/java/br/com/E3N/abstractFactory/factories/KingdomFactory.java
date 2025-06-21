package br.com.E3N.abstractFactory.factories;

import br.com.E3N.abstractFactory.service.Army;
import br.com.E3N.abstractFactory.service.Castle;
import br.com.E3N.abstractFactory.service.King;

public interface KingdomFactory {

    Army createArmy();
    Castle createCastle();
    King createKing();
}
