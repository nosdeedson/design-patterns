package br.com.E3N.cleanArchitecture.infrastructure.controllers;

import br.com.E3N.cleanArchitecture.core.application.dto.product.CreateProductDto;
import br.com.E3N.cleanArchitecture.core.application.dto.product.ProductDto;
import br.com.E3N.cleanArchitecture.core.application.usecase.product.CreateProductCommand;
import br.com.E3N.cleanArchitecture.core.application.usecase.product.FindAllProductCommand;
import br.com.E3N.cleanArchitecture.infrastructure.persistence.ProductRepositoryImpl;

import java.util.List;

/**
 * faking a controller just to study
 */
public class ProductController {
    private final FindAllProductCommand findAllProductCommand = new FindAllProductCommand();
    private final CreateProductCommand command = new CreateProductCommand();

    public void create(CreateProductDto in) {
        command.execute(in);
    }

    public List<ProductDto> findAll(){
        return findAllProductCommand.execute();
    }
}
