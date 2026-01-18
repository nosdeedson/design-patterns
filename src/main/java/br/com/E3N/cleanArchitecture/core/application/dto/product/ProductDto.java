package br.com.E3N.cleanArchitecture.core.application.dto.product;

import br.com.E3N.cleanArchitecture.core.domain.model.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public record ProductDto(String name, BigDecimal price, UUID id) {

    public ProductDto from(Product product) {
        return new ProductDto(product.getName(), product.getPrice(), product.getId());
    }

    public ProductDto(BigDecimal price, String name) {
        this(name, price, null);
    }

    public static List<ProductDto> fromList(List<Product> products) {
        var list = products.stream()
                .map(it -> new ProductDto(it.getName(), it.getPrice(), it.getId()))
                .toList();
        return list;
    }
}
