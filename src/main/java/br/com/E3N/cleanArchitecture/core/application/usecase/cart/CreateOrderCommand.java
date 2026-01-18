package br.com.E3N.cleanArchitecture.core.application.usecase.cart;

import br.com.E3N.cleanArchitecture.core.application.dto.cart.CartDto;
import br.com.E3N.cleanArchitecture.core.application.service.OrderService;
import br.com.E3N.cleanArchitecture.core.domain.repository.OrderRepository;
import br.com.E3N.cleanArchitecture.core.domain.repository.ProductRepository;
import br.com.E3N.cleanArchitecture.infrastructure.persistence.OrderRepositoryImpl;
import br.com.E3N.cleanArchitecture.infrastructure.persistence.ProductRepositoryImpl;

public class CreateOrderCommand {
    private final OrderRepository orderRepository = OrderRepositoryImpl.getInstance();
    private final ProductRepository productRepository = ProductRepositoryImpl.getInstance();
    private final OrderService orderService = new OrderService(orderRepository, productRepository);

    public void execute(CartDto dto){
        orderService.execute(dto);
    }

}
