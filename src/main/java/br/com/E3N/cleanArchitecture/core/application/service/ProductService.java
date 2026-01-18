package br.com.E3N.cleanArchitecture.core.application.service;

import br.com.E3N.cleanArchitecture.core.application.dto.product.CreateProductDto;
import br.com.E3N.cleanArchitecture.core.application.dto.product.ProductDto;
import br.com.E3N.cleanArchitecture.core.domain.model.Product;
import br.com.E3N.cleanArchitecture.core.domain.repository.ProductRepository;

import java.util.List;

public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public void create(CreateProductDto dto){
        var product = new Product(dto.name(), dto.price());
        this.repository.save(product);
    }

    public List<ProductDto> findAll(){
        var all = repository.getAll();
        return ProductDto.fromList(this.repository.getAll());
    }
}
