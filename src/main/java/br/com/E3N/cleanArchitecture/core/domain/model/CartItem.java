package br.com.E3N.cleanArchitecture.core.domain.model;

import java.math.BigDecimal;
import java.util.UUID;

public class CartItem {
    private final Product product;
    private int quantity;
    private UUID id;

    public CartItem(Product product, int quantity) {
        this.id = UUID.randomUUID();
        this.product = product;
        this.quantity = quantity;
    }

    public BigDecimal getTotalPrice() {
        return product.getPrice().multiply(new BigDecimal(quantity));
    }

    public void increaseQuantity(final int amount) {
        this.quantity = amount;
    }

    public Product getProduct() {
        return this.product;
    }

    public int getQuantity() {
        return quantity;
    }
}
