package br.com.E3N.abstractDocument;

import java.util.Optional;

public interface HasModel extends Document {

    default String getModel() {
        return get(Property.MODEL.toString()).toString();
    }
}
