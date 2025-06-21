package br.com.E3N.abstractDocument.service;

import br.com.E3N.abstractDocument.enums.Property;

public interface HasType extends Document {

    default String getType() {
        return get(Property.TYPE.toString()).toString();
    }
}
