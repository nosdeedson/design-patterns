package br.com.E3N.cleanArchitecture.core.application.usecase.product;

import br.com.E3N.cleanArchitecture.core.application.dto.product.CreateProductDto;
import br.com.E3N.cleanArchitecture.core.application.service.ProductService;
import br.com.E3N.cleanArchitecture.infrastructure.persistence.ProductRepositoryImpl;

public class CreateProductCommand {

    private final ProductRepositoryImpl productRepository = ProductRepositoryImpl.getInstance();
    private final ProductService productService = new ProductService(productRepository);

    public void execute(CreateProductDto dto) {
        productService.create(dto);
    }
}
