package br.com.E3N.composite.version2;

public class File extends FileSystem{

    public File(int size, String name) {
        super(size, name);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void delete() {
        System.out.println("Deleting file");
    }

    @Override
    public void save() {
        System.out.println("Saving file");
    }
}
