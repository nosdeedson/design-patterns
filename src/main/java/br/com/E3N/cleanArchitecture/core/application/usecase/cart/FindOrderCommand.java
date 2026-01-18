package br.com.E3N.cleanArchitecture.core.application.usecase.cart;

import br.com.E3N.cleanArchitecture.core.application.dto.order.OrderDto;
import br.com.E3N.cleanArchitecture.core.application.service.OrderService;
import br.com.E3N.cleanArchitecture.core.domain.repository.OrderRepository;
import br.com.E3N.cleanArchitecture.infrastructure.persistence.OrderRepositoryImpl;

import java.util.List;

public class FindOrderCommand {
    private final OrderRepository orderRepository = OrderRepositoryImpl.getInstance();
    private final OrderService orderService = new OrderService(orderRepository);

    public List<OrderDto> execute(){
        return orderService.findAll();
    }
}
