package br.com.E3N.cleanArchitecture.infrastructure.persistence;

import br.com.E3N.cleanArchitecture.core.domain.model.Order;
import br.com.E3N.cleanArchitecture.core.domain.repository.OrderRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OrderRepositoryImpl implements OrderRepository {

    static OrderRepositoryImpl instance = null;
    static List<Order> orders = new ArrayList<>();

    private OrderRepositoryImpl() {
    }

    public static OrderRepositoryImpl getInstance(){
        if (instance == null){
            return new OrderRepositoryImpl();
        }
        return instance;
    }

    @Override
    public void save(Order order) {
        orders.add(order);
    }

    @Override
    public Order getById(UUID id) {
        return orders.stream()
                .filter(it -> it.getOrderId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<Order> getAll() {
        return List.copyOf(orders);
    }

    @Override
    public void remove(Order order) {
        orders.remove(order);
    }
}
