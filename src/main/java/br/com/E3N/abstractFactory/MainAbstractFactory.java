package br.com.E3N.abstractFactory;


import br.com.E3N.abstractFactory.enums.KingdomType;
import br.com.E3N.abstractFactory.factories.FactoryMaker;
import br.com.E3N.abstractFactory.factories.KingdomFactory;
import br.com.E3N.abstractFactory.service.Army;
import br.com.E3N.abstractFactory.service.Castle;
import br.com.E3N.abstractFactory.service.King;

public class MainAbstractFactory {

    private static Army army;
    private static Castle castle;
    private static King king;

    public Army getArmy() {
        return army;
    }

    public Castle getCastle() {
        return castle;
    }

    public King getKing() {
        return king;
    }

    public static void setArmy(Army a) {
        army = a;
    }

    public static void setCastle(Castle c) {
        castle = c;
    }

    public static void setKing(King k) {
        king = k;
    }

    public static void createKingdom(KingdomFactory factory){
        setArmy(factory.createArmy());
        setCastle(factory.createCastle());
        setKing(factory.createKing());
    }


    public static void main(String[] args) {
        FactoryMaker factoryMaker = new FactoryMaker();
        KingdomFactory kingdomFactory = factoryMaker.makerFactory(KingdomType.ORC);
        createKingdom(kingdomFactory);

        System.out.println(army.getDescription());
        System.out.println(castle.getDescription());
        System.out.println(king.getDescription());

        kingdomFactory = factoryMaker.makerFactory(KingdomType.ELF);
        createKingdom(kingdomFactory);
        System.out.println("ANOTHER ARMY");

        System.out.println(army.getDescription());
        System.out.println(castle.getDescription());
        System.out.println(king.getDescription());
    }

}