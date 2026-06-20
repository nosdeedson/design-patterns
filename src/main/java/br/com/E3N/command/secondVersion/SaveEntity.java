package br.com.E3N.command.secondVersion;

public class SaveEntity implements Command{

    public void saveEntity(){
        System.out.println("Saving entity...");
    }

    @Override
    public void execute() {
        this.saveEntity();
    }
}
