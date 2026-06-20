package br.com.E3N.commander;

import java.math.BigDecimal;

public class Order {
    private final String product;
    private final BigDecimal payment;

    public Order(String product, BigDecimal payment) {
        this.product = product;
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Order{" +
                "product='" + product + '\'' +
                ", payment=" + payment +
                '}';
    }
}
