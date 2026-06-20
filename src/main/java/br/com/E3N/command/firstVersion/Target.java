package br.com.E3N.command.firstVersion;


public abstract class Target {
    private Size size;
    private Visibility visibility;

    public void printStatus(){
        System.out.printf("target: %s, size= %s, visibility: %s \n", this, getSize(), getVisibility());
    }

    public void changeSize(){
        var oldSize = getSize() == Size.NORMAL ? Size.SMALL : Size.NORMAL;
        setSize(oldSize);
    }

    public void changeVisibility() {
        var visible = getVisibility() == Visibility.INVISIBLE
                ? Visibility.VISIBLE : Visibility.INVISIBLE;
        setVisibility(visible);
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }
}
