package br.com.E3N.commander;

public class Commander {
    private final PaymentService paymentService;
    private final NotificationService notificationService;
    private final ShippingService shippingService;

    public Commander(PaymentService paymentService, NotificationService notificationService, ShippingService shippingService) {
        this.paymentService = paymentService;
        this.notificationService = notificationService;
        this.shippingService = shippingService;
    }

    public void placeOrder(Order order){
        paymentService.processPayment(order);

        try {
            boolean shipped = shippingService.shippingProduct(order);
            if (shipped) {
                notificationService.sendNotification(order);
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            if(e.getMessage().equals("Failed to ship the product")){
                paymentService.cancelPayment(order);
            } else {
                notificationService.queueingShipping(order);
            }
        }
    }
}
