package br.com.E3N.collectingParameterPattern;

public record PrinterItem(PaperSizes paperSizes, int amount, boolean isColour, boolean isDoubledSized) {

    @Override
    public String toString() {
        return "PrinterItem{" +
                "paperSizes=" + paperSizes +
                ", amount=" + amount +
                ", isColour=" + isColour +
                ", isDoubledSized=" + isDoubledSized +
                '}';
    }
}
