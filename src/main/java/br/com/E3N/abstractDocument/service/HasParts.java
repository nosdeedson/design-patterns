package br.com.E3N.abstractDocument.service;

import br.com.E3N.abstractDocument.Part;
import br.com.E3N.abstractDocument.enums.Property;

import java.util.stream.Stream;

public interface HasParts extends Document{

    default Stream<Part> getParts(){
        return children(Property.PARTS.toString(), Part::new);
    }
}
