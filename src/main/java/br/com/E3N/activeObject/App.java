package br.com.E3N.activeObject;

import java.util.ArrayList;
import java.util.List;

public class App implements Runnable{

    private static final int NUMBER_OF_CREATURES = 19_000;

    @Override
    public void run() {
        List<ActiveCreature> creatures = new ArrayList<>(NUMBER_OF_CREATURES);
        try {
            for (int i = 0; i < NUMBER_OF_CREATURES; i++) {
                creatures.add(new Orc(Orc.class.getName()+ i));
                creatures.get(i).eat();
                creatures.get(i).roam();
            }
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
            Thread.currentThread().interrupt();
        } finally {
            for (int i = 0; i < NUMBER_OF_CREATURES; i++) {
                creatures.get(i).kill(i);
            }
        }
    }
}
