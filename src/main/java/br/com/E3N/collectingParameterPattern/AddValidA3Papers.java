package br.com.E3N.collectingParameterPattern;

import java.util.Queue;

public class AddValidA3Papers {
    public static void addValidA3Papers(PrinterQueue printerQueue, Queue<PrinterItem> collector) {
        for (PrinterItem item : printerQueue.getPrinterQueue()) {
            if ((item.paperSizes() == PaperSizes.A3)) {
                collector.add(item);
            }
        }
    }
}
