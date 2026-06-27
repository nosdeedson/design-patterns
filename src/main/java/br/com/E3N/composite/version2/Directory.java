package br.com.E3N.composite.version2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Directory extends FileSystem{
    private final List<FileSystem> files = new ArrayList<>();

    public Directory(int size, String name) {
        super(size, name);
    }

    public void add(FileSystem fileSystem){
        this.files.add(fileSystem);
    }

    @Override
    int getSize() {
        return size;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    void delete() {
        System.out.println("Deleting directory");
    }

    @Override
    void save() {
        System.out.println("Saving directory");
    }

    public Optional<FileSystem> getFile(final String name){
        return files.stream()
                .filter(it -> it.getName().equals(name))
                .findFirst();
    }
}
