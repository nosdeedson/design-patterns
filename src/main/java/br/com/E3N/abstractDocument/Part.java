package br.com.E3N.abstractDocument;

import java.util.Map;

public class Part extends AbstractDocument implements HasModel, HasPrice, HasType {

    protected Part(Map<String, Object> properties) {
        super(properties);
    }


}
