package br.com.E3N.command.secondVersion;

public class SendEmail implements Command{

    public void sendEmail(){
        System.out.println("Sending e-mail...");
    }

    @Override
    public void execute() {
        this.sendEmail();
    }
}
