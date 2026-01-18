package br.com.E3N.cleanArchitecture.infrastructure.controllers;

import br.com.E3N.cleanArchitecture.core.application.dto.cart.CartDto;
import br.com.E3N.cleanArchitecture.core.application.dto.order.OrderDto;
import br.com.E3N.cleanArchitecture.core.application.usecase.cart.CreateOrderCommand;
import br.com.E3N.cleanArchitecture.core.application.usecase.cart.FindOrderCommand;

import java.util.List;

/**
 * faking a controller
 */
public class OrderController {

    private final CreateOrderCommand command = new CreateOrderCommand();
    private final FindOrderCommand findOrderCommand = new FindOrderCommand();
    public void create(CartDto dto){
        command.execute(dto);
    }

    public List<OrderDto> findAll(){
        return findOrderCommand.execute();
    }
}
