package br.com.E3N.collectingParameterPattern;

import java.util.Queue;

public class AddValidA2Papers {

    public static void addValidA2Papers(PrinterQueue printerQueue, Queue<PrinterItem> collector) {
        for (PrinterItem item : printerQueue.getPrinterQueue()) {
            if (item.paperSizes() == PaperSizes.A2 && !item.isDoubledSized()) {
                collector.add(item);
            }
        }
    }
}
