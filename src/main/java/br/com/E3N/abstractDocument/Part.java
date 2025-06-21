package br.com.E3N.abstractDocument;

import br.com.E3N.abstractDocument.service.HasModel;
import br.com.E3N.abstractDocument.service.HasPrice;
import br.com.E3N.abstractDocument.service.HasType;

import java.util.Map;

public class Part extends AbstractDocument implements HasModel, HasPrice, HasType {

    public Part(Map<String, Object> properties) {
        super(properties);
    }


}
