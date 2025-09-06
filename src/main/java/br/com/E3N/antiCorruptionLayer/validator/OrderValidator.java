package br.com.E3N.antiCorruptionLayer.validator;

import br.com.E3N.antiCorruptionLayer.modern.ModernOrder;

import java.math.BigDecimal;

public class OrderValidator {
    public static void validate(final ModernOrder modernOrder){
        StringBuilder builder = new StringBuilder();
        if (modernOrder.getAmount().compareTo(BigDecimal.ZERO) <= 0 ){
            builder.append("Amount must be greater than zero;");
        }
        if (modernOrder.getOrderId() == null){
            builder.append("Id must not be null");
        }
        if (!builder.isEmpty()){
            throw new IllegalArgumentException(builder.toString());
        }
    }
}
