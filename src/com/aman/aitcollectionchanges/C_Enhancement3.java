package com.aman.aitcollectionchanges;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

//removeif
public class C_Enhancement3 {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(3);
        l.add(4);
        l.add(1);

        l.forEach((v)-> System.out.println(v));

//        Predicate<Integer> p1 = (d)->false;

      l.removeIf(p->p%2 ==0);

      l.forEach((c)-> System.out.println(c +" "));




    }
}
