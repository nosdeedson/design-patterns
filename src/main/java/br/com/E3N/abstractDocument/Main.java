package br.com.E3N.abstractDocument;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Constructing a Car with parts");

        var wheelProperties = Map.of(
                Property.TYPE.toString(), "wheel",
                Property.MODEL.toString(), "15C",
                Property.PRICE.toString(), 100L
        );

        var doorProperties = Map.of(
                Property.TYPE.toString(), "door",
                Property.MODEL.toString(), "door",
                Property.PRICE.toString(), 300L
        );

        var carProperties = Map.of(
                Property.MODEL.toString(), "Chevy",
                Property.PRICE.toString(), 15000L,
                Property.PARTS.toString(), List.of(wheelProperties, doorProperties)
        );

        var car = new Car(carProperties);
        LOGGER.info("My car");
        System.out.println(car.getModel());
        System.out.println(car.getPrice());
        car.getParts().forEach(
                it -> {
                    System.out.println(it.getModel());
                    System.out.println(it.getPrice());
                    System.out.println(it.getType());
                }
        );
    }
}
