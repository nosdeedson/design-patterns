package br.com.E3N.abstractDocument;

import java.util.Map;

public class Car extends AbstractDocument implements HasModel, HasPrice, HasParts {

    protected Car(Map<String, Object> properties) {
        super(properties);
    }

}
