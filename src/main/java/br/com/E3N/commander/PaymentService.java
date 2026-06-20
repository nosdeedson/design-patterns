package br.com.E3N.commander;

import java.util.Random;

public class PaymentService {

    public void processPayment(Order order) {
        Random random = new Random();
        // The random number is just to fake an error, to handle the problem in the commander
        if (random.nextInt(3) == 1) {
            throw new RuntimeException("Failed to finalize the payment");
        }
        System.out.print("Paying: ");
        System.out.println(order.toString());
    }

    public void cancelPayment(Order order) {
        System.out.print("Payment of ");
        System.out.println(order.toString() + " canceled");
    }

}
