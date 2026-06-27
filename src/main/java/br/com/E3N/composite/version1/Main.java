package br.com.E3N.composite.version1;

public class Main {

    public static void main(String[] args) {
        Window w = new Window(0, 70);
        w.add(new Button(10, 20, "Save"));
        w.add(new Label(30, 40, "Label"));
        var input = new TextField(50, 60);
        input.keyPressed('k');
        w.add(input);
        w.paint();
        System.out.println();
        w.clickAll();
        System.out.println();
        w.sendKey('A');
        w.sendKey('B');
    }
}
