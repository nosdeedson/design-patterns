package br.com.E3N.cleanArchitecture;

import br.com.E3N.cleanArchitecture.core.application.dto.cart.CartDto;
import br.com.E3N.cleanArchitecture.core.application.dto.cartItem.CartItemDto;
import br.com.E3N.cleanArchitecture.core.domain.model.Cart;

public class Main {

    public static void main(String[] args) {
        FakingRequest.createProduct();
        var products = FakingRequest.findAll();
        var items = products.stream()
                .map(it -> new CartItemDto(it.id(), it.name(), 1))
                .toList();
        CartDto cartDto = new CartDto(items);
        FakingRequest.createOrder(cartDto);
        var order = FakingRequest.findAllOrder();
        System.out.println(order);
    }
}
