package br.com.E3N.abstractFactory.enums;

public enum KingdomType {
    ELF ("Elf"),
    ORC ("Orc");

    KingdomType(String orc) {
    }

    public KingdomType getValue(final String name){
        var type = KingdomType.ELF;
        for (KingdomType kt: KingdomType.values()){
            if(kt.name().equals(name)){
                type = kt;
            }
            type = null;
        }
        return type;
    }

    public KingdomType[] getValues(){
        return KingdomType.values();
    }
}
