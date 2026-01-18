package br.com.E3N.cleanArchitecture.core.domain.model;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class Order {
    private final UUID orderId;
    private final List<CartItem> items;
    private final BigDecimal total;
    private final Instant createdAt;

    private Order(UUID orderId, List<CartItem> items, BigDecimal total) {
        this.orderId = orderId;
        this.items = items;
        this.total = total;
        this.createdAt = Instant.now();
    }

    public static Order fromCart(Cart cart){
        return new Order(
                UUID.randomUUID(),
                List.copyOf(cart.getItems()),
                cart.getTotalPrice()
        );
    }

    public UUID getOrderId() {
        return orderId;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }
}
