package br.com.E3N.composite.version1;

import java.util.ArrayList;
import java.util.List;

public class Window extends Component {

    private final List<Component> components = new ArrayList<>();

    public Window(int x, int y) {
        super(x, y);
    }

    public void add(Component component){
        components.add(component);
    }

    public void paint(){
        for (Component c: components){
            c.paint();
        }
    }

    public void clickAll(){
        for (Component c: components){
            c.click();
        }
    }

    public void sendKey(char key){
        for (Component c: components){
            c.keyPressed(key);
        }
    }
}
