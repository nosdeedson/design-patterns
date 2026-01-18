package br.com.E3N.cleanArchitecture.core.application.dto.order;

import br.com.E3N.cleanArchitecture.core.domain.model.Order;

import java.util.List;
import java.util.UUID;

public record OrderItemDto(String productName, int quantity, UUID id) {

    public static List<OrderItemDto> fromOrder(Order order) {
        return order.getItems().stream()
                .map(it -> new OrderItemDto(
                        it.getProduct().getName(),
                        it.getQuantity(),
                        order.getOrderId()
                )).toList();
    }
}
