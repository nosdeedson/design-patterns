package br.com.E3N.collectingParameterPattern;

import java.util.LinkedList;
import java.util.Queue;

public class App {

    private static final PrinterQueue printerQueue = PrinterQueue.getInstance();

    public static void execute() {
        //  print jobs
        printerQueue.addPrinterItem(new PrinterItem(PaperSizes.A4, 5, false, false));
        printerQueue.addPrinterItem(new PrinterItem(PaperSizes.A4, 10, true, false));
        printerQueue.addPrinterItem(new PrinterItem(PaperSizes.A3, 2, false, false));
        printerQueue.addPrinterItem(new PrinterItem(PaperSizes.A2, 5, true, false));
        printerQueue.addPrinterItem(new PrinterItem(PaperSizes.A2, 7, false, false));

        // collector of results
        Queue<PrinterItem> collector = new LinkedList<>();

        AddValidA4Papers.addValidA4Papers(printerQueue, collector);
        AddValidA3Papers.addValidA3Papers(printerQueue, collector);
        AddValidA2Papers.addValidA2Papers(printerQueue, collector);

        System.out.println("Collected valid print jobs:");
        collector.forEach(System.out::println);
    }
}
