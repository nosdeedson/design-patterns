package br.com.E3N.adapter.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App2 {

    public static void execute() {
        System.out.println("#################### printing string ######################");
        String[] strings = {"java", "adapter", "pattern"};

        var adapter = new IterableAdapter<String>(strings);

        IteratorOfList printer = new IteratorOfList(adapter);
        printer.print();

        System.out.println("#################### printing integers ######################");
        Integer[] integers = {1, 2, 3, 4};
        var adapter2 = new IterableAdapter<Integer>(integers);
        printer = new IteratorOfList(adapter2);
        printer.print();
    }
}
