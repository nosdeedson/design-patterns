package br.com.E3N.cleanArchitecture.core.application.dto.order;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

public record OrderDto(
        UUID id,
        BigDecimal total,
        Instant createdAt, List<OrderItemDto> items) {
}
