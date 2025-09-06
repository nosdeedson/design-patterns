package br.com.E3N.antiCorruptionLayer.simulateExternalDependency;

import br.com.E3N.antiCorruptionLayer.legacy.LegacyOrder;

import java.util.ArrayList;
import java.util.List;

public class LegacyShop {

    List<LegacyOrder> orders = new ArrayList<>(List.of(
            new LegacyOrder("ORD-01991ff1-ce7b-7acc-8194-f8b157382379", 12.5, "C"),
            new LegacyOrder("ORD-01991ff1-ce7b-7acc-8194-f8b157382380", 12.5, "F"),
            new LegacyOrder("ORD-01991ff1-ce7b-7acc-8194-f8b157382381", 12.5, "P")
    ));

    public LegacyOrder getOrder(final String orderId) {
        return orders.stream()
                .filter(it -> it.getId().equals("ORD-" + orderId)).findFirst()
                .orElse(null);
    }

    public void addLegacyOrder(final LegacyOrder legacyOrder) {
        this.orders.add(legacyOrder);
    }

    public int quantityOfOrder(){
        return orders.size();
    }


}
