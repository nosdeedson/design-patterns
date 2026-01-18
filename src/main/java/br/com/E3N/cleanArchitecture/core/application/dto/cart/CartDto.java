package br.com.E3N.cleanArchitecture.core.application.dto.cart;

import br.com.E3N.cleanArchitecture.core.application.dto.cartItem.CartItemDto;
import br.com.E3N.cleanArchitecture.core.domain.model.Cart;

import java.util.List;

public record CartDto(List<CartItemDto> itemDTOs) {

}
