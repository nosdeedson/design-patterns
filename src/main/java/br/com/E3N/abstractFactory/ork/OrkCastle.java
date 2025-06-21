package br.com.E3N.abstractFactory.ork;

import br.com.E3N.abstractFactory.service.Castle;

public class OrkCastle implements Castle {
    @Override
    public String getDescription() {
        return "Ork Castle";
    }
}
