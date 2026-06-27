package br.com.E3N.composite.version1;

public class TextField extends Component{

    private String value = "";

    public TextField(int x, int y) {
        super(x, y);
    }

    @Override
    public void paint() {
        System.out.println("Drawing text field: " + value);
    }

    @Override
    public void keyPressed(char key) {
        value += key;
        System.out.println("Typed: " + value);
    }
}
