package br.com.E3N.antiCorruptionLayer.app;

import br.com.E3N.antiCorruptionLayer.facade.AntiCorruptionLayerFacade;
import br.com.E3N.antiCorruptionLayer.modern.ModernOrder;
import br.com.E3N.antiCorruptionLayer.modern.OrderStatus;
import br.com.E3N.antiCorruptionLayer.simulateExternalDependency.LegacyShop;
import br.com.E3N.antiCorruptionLayer.translator.OrderTranslator;

import java.math.BigDecimal;
import java.util.UUID;

public class App {

    public static void execute(){
        var legacyShop = new LegacyShop();
        var orderTranslator = new OrderTranslator();
        var facade = new AntiCorruptionLayerFacade(legacyShop, orderTranslator);

//        sending a ModernOrder to legacyShop
        System.out.printf("Quantity of orders already exist: %d%n", legacyShop.quantityOfOrder());
        var modernOrder = new ModernOrder(UUID.randomUUID(), new BigDecimal("12.4"), OrderStatus.PENDING);
        facade.addLegacyOrder(modernOrder);
        System.out.printf("Quantity of orders after adding: %d%n", legacyShop.quantityOfOrder());

//        getting LegacyOrder as ModernOrder ()
        var modernOrder1 = facade.getModernOrder("01991ff1-ce7b-7acc-8194-f8b157382379");
        System.out.println(modernOrder1);

//        modernOrder1 must be null
        modernOrder1 = facade.getModernOrder("01992017-b25f-7e72-a49d-39057eaae02a");
        if (modernOrder1 == null) {
            System.out.println("Order does not exist");
        } else {
            System.out.println(modernOrder1.toString());
        }
    }
}
