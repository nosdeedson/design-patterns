package br.com.E3N.abstractDocument.service;

import br.com.E3N.abstractDocument.enums.Property;

public interface HasModel extends Document {

    default String getModel() {
        return get(Property.MODEL.toString()).toString();
    }
}
