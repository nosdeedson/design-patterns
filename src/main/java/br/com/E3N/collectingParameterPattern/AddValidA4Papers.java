package br.com.E3N.collectingParameterPattern;

import java.util.Queue;

public class AddValidA4Papers {

    public static void addValidA4Papers(PrinterQueue printerQueue, Queue<PrinterItem> collector) {
        for (PrinterItem item : printerQueue.getPrinterQueue()) {
            if (item.paperSizes() == PaperSizes.A4) {
                if (!item.isColour() || !item.isDoubledSized()) {
                    collector.add(item);
                }
            }
        }
    }
}
