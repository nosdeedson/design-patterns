package br.com.E3N.command.secondVersion;

public class PrintPdf implements Command{

    public void printPdf(){
        System.out.println("Printing PDF...");
    }

    @Override
    public void execute() {
        this.printPdf();
    }
}
