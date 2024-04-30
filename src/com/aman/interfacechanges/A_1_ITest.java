package com.aman.interfacechanges;

public interface A_1_ITest {

    public void display();



    default void show(){
        System.out.println("in show method");
    }

    static void add(){
        System.out.println("In add method");
    }



}
