package br.com.E3N.adapter.list;

import java.util.Iterator;

public class IterableAdapter<T> implements Iterable<T> {

    private final T[] array;

    public IterableAdapter(T[] array) {
        this.array = array;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < array.length;
            }

            @Override
            public T next() {
                if (!hasNext()) try {
                    throw new NoSuchFieldException("Index out of bound");
                } catch (NoSuchFieldException e) {
                    throw new RuntimeException(e);
                }
                return array[index++];
            }
        };
    }

}
