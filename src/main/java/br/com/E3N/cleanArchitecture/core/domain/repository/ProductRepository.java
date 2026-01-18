package br.com.E3N.cleanArchitecture.core.domain.repository;

import br.com.E3N.cleanArchitecture.core.domain.model.Product;

import java.util.List;
import java.util.UUID;

public interface ProductRepository {
    Product getById(UUID id);
    void save(Product product);
    void remove(Product product);
    List<Product> getAll();
}
