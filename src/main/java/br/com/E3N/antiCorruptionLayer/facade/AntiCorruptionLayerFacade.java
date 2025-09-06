package br.com.E3N.antiCorruptionLayer.facade;

import br.com.E3N.antiCorruptionLayer.legacy.LegacyOrder;
import br.com.E3N.antiCorruptionLayer.modern.ModernOrder;
import br.com.E3N.antiCorruptionLayer.simulateExternalDependency.LegacyShop;
import br.com.E3N.antiCorruptionLayer.translator.OrderTranslator;

public class AntiCorruptionLayerFacade {

    private final LegacyShop legacyShop;
    private final OrderTranslator orderTranslator;

    public AntiCorruptionLayerFacade(LegacyShop legacyShop, OrderTranslator orderTranslator) {
        this.legacyShop = legacyShop;
        this.orderTranslator = orderTranslator;
    }

    public void addLegacyOrder(ModernOrder modernOrder){
        var legacy = orderTranslator.toLegacy(modernOrder);
        legacyShop.addLegacyOrder(legacy);
    }

    public ModernOrder getModernOrder(final String orderId){
        LegacyOrder legacyOrder = legacyShop.getOrder(orderId);
        if (legacyOrder == null) return  null;
        return orderTranslator.toModern(legacyOrder);
    }
}
