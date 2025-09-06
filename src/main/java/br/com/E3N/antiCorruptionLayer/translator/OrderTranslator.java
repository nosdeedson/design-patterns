package br.com.E3N.antiCorruptionLayer.translator;

import br.com.E3N.antiCorruptionLayer.legacy.LegacyOrder;
import br.com.E3N.antiCorruptionLayer.modern.ModernOrder;

public class OrderTranslator {

    public ModernOrder toModern(final LegacyOrder legacyOrder){
        return new ModernOrder(legacyOrder);
    }

    public LegacyOrder toLegacy(final ModernOrder modernOrder){
        return new LegacyOrder(modernOrder);
    }
}
