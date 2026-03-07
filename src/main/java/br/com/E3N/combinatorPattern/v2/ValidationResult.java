package br.com.E3N.combinatorPattern.v2;

public record ValidationResult(boolean valid, String message) {

    public static ValidationResult ok() {
        return new ValidationResult(true, "");
    }

    public static ValidationResult fail(String message){
        return new ValidationResult(false, message);
    }

    public boolean isValid(){
        return valid;
    }
}
