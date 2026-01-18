package br.com.E3N.cleanArchitecture.core.application.dto.product;

import java.math.BigDecimal;

public record CreateProductDto(String name, BigDecimal price) {
}
