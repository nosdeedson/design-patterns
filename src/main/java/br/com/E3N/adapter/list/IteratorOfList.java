package br.com.E3N.adapter.list;

public class IteratorOfList {
    private final Iterable<?> list;

    public IteratorOfList(Iterable<?> list) {
        this.list = list;
    }

    public void print() {
        list.forEach(System.out::println);
    }
}
