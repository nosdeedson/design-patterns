package br.com.E3N.abstractDocument;

import br.com.E3N.abstractDocument.service.HasModel;
import br.com.E3N.abstractDocument.service.HasParts;
import br.com.E3N.abstractDocument.service.HasPrice;

import java.util.Map;

public class Car extends AbstractDocument implements HasModel, HasPrice, HasParts {

    protected Car(Map<String, Object> properties) {
        super(properties);
    }

}
