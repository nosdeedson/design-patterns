package br.com.E3N.abstractDocument;

import java.util.Optional;

public interface HasType extends Document {

    default String getType() {
        return get(Property.TYPE.toString()).toString();
    }
}
