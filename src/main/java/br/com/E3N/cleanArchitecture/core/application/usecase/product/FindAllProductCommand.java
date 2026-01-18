package br.com.E3N.cleanArchitecture.core.application.usecase.product;

import br.com.E3N.cleanArchitecture.core.application.dto.product.ProductDto;
import br.com.E3N.cleanArchitecture.core.application.service.ProductService;
import br.com.E3N.cleanArchitecture.core.domain.repository.ProductRepository;
import br.com.E3N.cleanArchitecture.infrastructure.persistence.ProductRepositoryImpl;

import java.util.List;

public class FindAllProductCommand {

    private final ProductRepository productRepository = ProductRepositoryImpl.getInstance();
    private final ProductService productService = new ProductService(productRepository);

    public List<ProductDto> execute(){
        return productService.findAll();
    }
}
