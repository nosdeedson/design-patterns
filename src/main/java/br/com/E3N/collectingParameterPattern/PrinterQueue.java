package br.com.E3N.collectingParameterPattern;

import java.util.LinkedList;
import java.util.Queue;

public class PrinterQueue {
    private static final PrinterQueue INSTANCE = new PrinterQueue();
    private final Queue<PrinterItem> printerQueue = new LinkedList<>();

    private PrinterQueue() {
    }

    public static PrinterQueue getInstance() {
        return INSTANCE;
    }

    public void addPrinterItem(PrinterItem item) {
        printerQueue.add(item);
    }

    public Queue<PrinterItem> getPrinterQueue() {
        return printerQueue;
    }
}
