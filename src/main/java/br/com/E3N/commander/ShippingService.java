package br.com.E3N.commander;

import java.util.Random;

public class ShippingService {

    public boolean shippingProduct(Order order) {
        Random random = new Random();
        // The random number is just to fake an error, to handle the problem in the commander
        if (random.nextInt(3) == 1) throw new RuntimeException("Failed to ship the product");
        System.out.print("Product shipped ");
        System.out.println(order.toString());
        return true;
    }

    public void cancelShipping(Order order) {
        System.out.println("Canceling shipping of ");
        System.out.println(order.toString());
    }

}
