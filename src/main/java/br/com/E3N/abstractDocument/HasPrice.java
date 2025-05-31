package br.com.E3N.abstractDocument;

import java.util.Optional;

public interface HasPrice extends Document {

    default String getPrice() {
        return get(Property.PRICE.toString()).toString();
    }
}
