package com.aman.aitcollectionchanges;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Enhancements {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(3);
        l.add(4);
        l.add(1);

        Consumer<Integer> c = (x)->{
            System.out.print(x + " ");
        };

        l.forEach(c);
        System.out.println();
        l.forEach((s)-> System.out.print(s+" "));
    }
}
