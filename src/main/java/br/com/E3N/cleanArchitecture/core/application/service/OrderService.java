package br.com.E3N.cleanArchitecture.core.application.service;

import br.com.E3N.cleanArchitecture.core.application.dto.cart.CartDto;
import br.com.E3N.cleanArchitecture.core.application.dto.cartItem.CartItemDto;
import br.com.E3N.cleanArchitecture.core.application.dto.order.OrderDto;
import br.com.E3N.cleanArchitecture.core.application.dto.order.OrderItemDto;
import br.com.E3N.cleanArchitecture.core.domain.model.Cart;
import br.com.E3N.cleanArchitecture.core.domain.model.Order;
import br.com.E3N.cleanArchitecture.core.domain.repository.OrderRepository;
import br.com.E3N.cleanArchitecture.core.domain.repository.ProductRepository;

import java.util.List;

public class OrderService {

    private final OrderRepository orderRepository;
    private ProductRepository productRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderService(OrderRepository orderRepository, ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }

    public void execute(CartDto cartDto) {
        Cart cart = new Cart();
        for (CartItemDto dto: cartDto.itemDTOs()){
            var product = productRepository.getById(dto.productId());
            cart.addProduct(product, dto.quantity());
        }
        var order = Order.fromCart(cart);
        this.orderRepository.save(order);
    }

    public List<OrderDto> findAll(){
        List<Order> orders = this.orderRepository.getAll();
        return orders.stream()
                .map(it -> new OrderDto(
                        it.getOrderId(),
                        it.getTotal(),
                        it.getCreatedAt(),
                        OrderItemDto.fromOrder(it))
                ).toList();
    }

}
