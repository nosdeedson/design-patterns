package br.com.E3N.abstractDocument;

import br.com.E3N.abstractDocument.enums.Property;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

public class MainAbstractDocument {

    private static final Logger LOGGER = Logger.getLogger(MainAbstractDocument.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Constructing a Car with parts");

//        The code bellow create an immutable map
//        var wheelProperties = Map.of(
//                Property.TYPE.toString(), "wheel",
//                Property.MODEL.toString(), "15C",
//                Property.PRICE.toString(), 100L
//        );
//
//        var doorProperties = Map.of(
//                Property.TYPE.toString(), "door",
//                Property.MODEL.toString(), "door",
//                Property.PRICE.toString(), 300L
//        );
//
//        var carProperties = Map.of(
//                Property.MODEL.toString(), "Chevy",
//                Property.PRICE.toString(), 15000L,
//                Property.PARTS.toString(), List.of(wheelProperties, doorProperties)
//        );
        var wheel = new HashMap<String, Object>();
        wheel.put(Property.TYPE.toString(), "wheel");
        wheel.put(Property.MODEL.toString(), "15C");
        wheel.put(Property.PRICE.toString(), 100L);

        var door = new HashMap<String, Object>();
        door.put(Property.TYPE.toString(), "door");
        door.put(Property.MODEL.toString(), "door");
        door.put(Property.PRICE.toString(), "300L");

        var carProperties = new HashMap<String, Object>();
        carProperties.put(Property.MODEL.toString(), "Chevy");
        carProperties.put(Property.PRICE.toString(), 1500L);
        carProperties.put(Property.PARTS.toString(), List.of(door, wheel));
        var car = new Car(carProperties);
        car.put("test", BigDecimal.valueOf(45));
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
        var parts = car.children("TEST", Part::new);

        parts.forEach(it -> System.out.println("TEST: " + it.get("TEST").toString()));
    }
}
