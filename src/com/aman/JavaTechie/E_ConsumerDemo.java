package com.aman.JavaTechie;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class E_ConsumerDemo {
//    @Override
//    public void accept(Integer o) {
//        System.out.println(o);
//    }



    public static void main(String[] args) {
//        Consumer<Integer> c = (t)-> System.out.println(t);
//            c.accept(4);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);




        list.stream().forEach(t-> System.out.println(t));
    }
}
