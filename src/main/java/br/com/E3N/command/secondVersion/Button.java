package br.com.E3N.command.secondVersion;

public class Button {

    private final Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void click(){
        this.command.execute();
    }
}
