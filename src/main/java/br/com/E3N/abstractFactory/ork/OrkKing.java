package br.com.E3N.abstractFactory.ork;

import br.com.E3N.abstractFactory.service.King;

public class OrkKing implements King {
    @Override
    public String getDescription() {
        return "Ork King";
    }
}
