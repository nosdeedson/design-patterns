package br.com.E3N.antiCorruptionLayer.legacy;

import br.com.E3N.antiCorruptionLayer.modern.ModernOrder;

public class LegacyOrder {
    private final String id;
    private final double total;
    private final String status;

    public LegacyOrder(String id, double total, String status) {
        this.id = id;
        this.total = total;
        this.status = status;
    }

    public LegacyOrder(final ModernOrder modernOrder) {
        this.id =  "ORD-" + modernOrder.getOrderId().toString();
        this.status = modernOrder.getStatus().toLegacyOrderStatus();
        this.total = modernOrder.getAmount().doubleValue();
    }

    public String getId() {
        return id;
    }

    public double getTotal() {
        return total;
    }

    public String getStatus() {
        return status;
    }

}
