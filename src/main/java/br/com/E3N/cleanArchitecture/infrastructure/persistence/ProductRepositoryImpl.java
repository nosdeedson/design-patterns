package br.com.E3N.cleanArchitecture.infrastructure.persistence;

import br.com.E3N.cleanArchitecture.core.domain.model.Product;
import br.com.E3N.cleanArchitecture.core.domain.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProductRepositoryImpl implements ProductRepository {

    static List<Product> products = new ArrayList<>();
    static ProductRepositoryImpl instance = null;
    private ProductRepositoryImpl() {
    }

    public static ProductRepositoryImpl getInstance(){
        if(instance == null){
           return new ProductRepositoryImpl();
        }
        return instance;
    }

    @Override
    public Product getById(UUID id) {
        return products.stream()
                .filter(it -> it.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public void remove(Product product) {
        products.remove(product);
    }

    @Override
    public List<Product> getAll() {
        return List.copyOf(products);
    }
}
