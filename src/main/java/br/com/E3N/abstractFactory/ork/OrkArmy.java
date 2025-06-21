package br.com.E3N.abstractFactory.ork;

import br.com.E3N.abstractFactory.service.Army;

public class OrkArmy implements Army {

    @Override
    public String getDescription() {
        return "Ork Army";
    }
}
