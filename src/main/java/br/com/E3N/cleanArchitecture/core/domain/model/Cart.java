package br.com.E3N.cleanArchitecture.core.domain.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cart {
    private UUID id;
    private final List<CartItem> items = new ArrayList<>();

    public void addProduct(Product product, int quantity){
        for (CartItem item: items){
            if (item.getProduct().getId().equals(product.getId())){
                item.increaseQuantity(quantity);
                return;
            }
        }
        items.add(new CartItem(product, quantity));
    }

    public BigDecimal getTotalPrice() {
        return items.stream()
                .map(CartItem::getTotalPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public List<CartItem> getItems() {
        return List.copyOf(items);
    }
}
