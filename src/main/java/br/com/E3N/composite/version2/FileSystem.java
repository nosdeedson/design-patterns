package br.com.E3N.composite.version2;

public abstract class FileSystem {
    protected final int size;
    protected final String name;

    public FileSystem(int size, String name) {
        this.size = size;
        this.name = name;
    }

    abstract int getSize();
    abstract String getName();
    abstract void delete();
    abstract void save();
}
