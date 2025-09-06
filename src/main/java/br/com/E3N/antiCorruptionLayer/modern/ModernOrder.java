package br.com.E3N.antiCorruptionLayer.modern;

import br.com.E3N.antiCorruptionLayer.legacy.LegacyOrder;
import br.com.E3N.antiCorruptionLayer.validator.OrderValidator;

import java.math.BigDecimal;
import java.util.UUID;

public class ModernOrder {
    private final UUID orderId;
    private final BigDecimal amount;
    private final OrderStatus status;

    public ModernOrder(UUID orderId, BigDecimal amount, OrderStatus status) {
        this.orderId = orderId;
        this.amount = amount;
        this.status = status;
    }

    public ModernOrder(final LegacyOrder legacyOrder) {
        this.orderId = UUID.randomUUID();
        this.amount = BigDecimal.valueOf(legacyOrder.getTotal());
        this.status = OrderStatus.toModernOrderStatus(legacyOrder.getStatus());
        OrderValidator.validate(this);
    }

    public UUID getOrderId() {
        return orderId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public OrderStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "ModernOrder{" +
                "orderId=" + orderId +
                ", amount=" + amount +
                ", status=" + status +
                '}';
    }
}
