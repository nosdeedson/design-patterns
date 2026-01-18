package br.com.E3N.cleanArchitecture.core.domain.repository;

import br.com.E3N.cleanArchitecture.core.domain.model.Order;

import java.util.List;
import java.util.UUID;

public interface OrderRepository {
    void save(Order order);

    Order getById(UUID id);

    List<Order> getAll();

    void remove(Order order);
}
