package br.com.E3N.commander;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        var order = new Order("any", BigDecimal.TEN);
        var commander = new Commander(new PaymentService(), new NotificationService(), new ShippingService());
        commander.placeOrder(order);
    }
}
