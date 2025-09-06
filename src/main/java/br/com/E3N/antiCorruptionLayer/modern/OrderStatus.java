package br.com.E3N.antiCorruptionLayer.modern;

public enum OrderStatus {
    COMPLETED, PENDING, CANCELLED;

    public static OrderStatus toModernOrderStatus(final String legacyStatus){
       return switch (legacyStatus){
            case "C" -> OrderStatus.CANCELLED;
            case "F" -> OrderStatus.COMPLETED;
            case "P" -> OrderStatus.PENDING;
           default -> null;
        };
    }

    public String toLegacyOrderStatus(){
        return switch (this){
            case COMPLETED -> "F";
            case CANCELLED -> "C";
            case PENDING -> "P";
            default -> null;
        };
    }
}
