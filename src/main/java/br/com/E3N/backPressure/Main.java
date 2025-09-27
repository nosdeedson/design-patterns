package br.com.E3N.backPressure;

public class Main {
    //                .doOnComplete(() -> System.out.println("Done!"))
//                .blockLast();
    public static void main(String[] args) throws InterruptedException {
        Subscriber subscriber = new Subscriber();
        Publisher
                .publish(1, 20, 200)
                .subscribe(subscriber);

        Thread.sleep(10000);
    }
}
