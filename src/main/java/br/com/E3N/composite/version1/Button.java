package br.com.E3N.composite.version1;

public class Button extends Component{

    private final String text;
    public Button(int x, int y, String text) {
        super(x, y);
        this.text = text;
    }

    @Override
    public void paint() {
        System.out.println("Drawing button: " + text);
    }

    @Override
    public void click() {
        System.out.println(("Button '" + text + "' clicked"));
    }
}
