package br.com.E3N.commander;

import java.util.Random;

public class NotificationService {

    public void sendNotification(Order order) {
        Random random = new Random();
//        The random number is just to fake an error, to handle the problem in the commander
        if (random.nextInt(3) == 1) throw new RuntimeException("Failed to send the message.");
        System.out.print("send notification to client about ");
        System.out.println(order.toString());
    }

    public void cancelNotification(Order order){
        System.out.print("Notification canceled for ");
        System.out.println(order.toString());
    }

    public void queueingShipping(Order order){
        System.out.print("Send the message order to a queue product: ");
        System.out.println(order.toString());
    }
}
