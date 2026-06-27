package br.com.E3N.composite.version2;

public class Main {

    public static void main(String[] args) {
        var file = new File(10, "text.docx");
        file.save();
        System.out.println(file.getName());
        System.out.println(file.getSize());
        var directory = new Directory(50, "reports");
        directory.save();
        directory.add(file);
        System.out.println(directory.getName());
        System.out.println(directory.getSize());
        var fromDirectory = directory.getFile(file.getName());
        fromDirectory.ifPresent(f -> System.out.println(f.equals(file)));
    }
}
