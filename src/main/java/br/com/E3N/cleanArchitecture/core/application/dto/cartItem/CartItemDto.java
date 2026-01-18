package br.com.E3N.cleanArchitecture.core.application.dto.cartItem;

import java.util.UUID;

public record CartItemDto(UUID productId, String productName, int quantity ) {
}
