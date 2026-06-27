package br.com.E3N.composite.version1;

public abstract class Component {
    protected int x;
    protected int y;

    public Component(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void paint();

    public void click() {
        System.out.println(this.getClass().getSimpleName());
    }

    public void keyPressed(char key){
        System.out.println("Key Pressed on: " + this.getClass().getSimpleName());
    }
}
