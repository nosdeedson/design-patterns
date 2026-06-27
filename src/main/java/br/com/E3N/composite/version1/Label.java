package br.com.E3N.composite.version1;

public class Label extends Component{

    private final String text;

    public Label(int x, int y, String text) {
        super(x, y);
        this.text = text;
    }

    @Override
    public void paint() {
        System.out.println("Drawing Label: " + text);
    }
}
