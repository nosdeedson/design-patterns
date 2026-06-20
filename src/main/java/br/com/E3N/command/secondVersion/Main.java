package br.com.E3N.command.secondVersion;

public class Main {
    public static void main(String[] args) {
        var button = new Button(new PrintPdf());

        button.click();

        button = new Button(new SaveEntity());
        button.click();

        button = new Button(new SendEmail());
        button.click();
    }
}
