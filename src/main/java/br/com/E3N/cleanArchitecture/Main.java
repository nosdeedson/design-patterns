package br.com.E3N.cleanArchitecture;

import br.com.E3N.cleanArchitecture.core.application.dto.cart.CartDto;
import br.com.E3N.cleanArchitecture.core.application.dto.cartItem.CartItemDto;

public class Main {

    public static void main(String[] args) {
        /*
         * Clean Architecture is a software design approach that isolate business logic from external concerns,
         * like database connection and sql language used to persist data, frameworks, UI pages.
         * Basically this pattern isolate the domain of system and the rules that regulates the domain existence.
         * So, we can code the business rules of the domain one time and adapt or connect the tools
         * in order to make the system work.
         * the structure must have strict layers and clear boundaries, ensuring that one change in one layer
         * won't break the role system.
         * In this pattern the communication between layers goes in one direction, and they cannot be bidirectional.
         * In other words, an upper layer calls a down layer, but the down layer never calls the upper layer.
         */
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
