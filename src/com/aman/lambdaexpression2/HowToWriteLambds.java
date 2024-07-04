package com.aman.lambdaexpression2;

import java.util.function.Consumer;

@FunctionalInterface
interface A{
    public abstract void display(int z);
   // public abstract void display2(int z);

    default  void add(int a){

        System.out.println("  " + a);
    }

    static  void add2(int c){
        System.out.println("  " +c);
    }


}
public class HowToWriteLambds  {


//    @Override
//    public void display() {
//        System.out.println("display");
//    }

    public static void main(String[] args) {
        A a =(x)-> System.out.println("display " + x);

        a.display(4);

        Consumer<Integer> c1 = (r)->{
            System.out.println(r + "consumer");
        };

        c1.accept(10);
    }






}
