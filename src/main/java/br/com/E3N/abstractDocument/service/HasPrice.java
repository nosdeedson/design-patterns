package br.com.E3N.abstractDocument.service;

import br.com.E3N.abstractDocument.enums.Property;

public interface HasPrice extends Document {

    default String getPrice() {
        return get(Property.PRICE.toString()).toString();
    }
}
