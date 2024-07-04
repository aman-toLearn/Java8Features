package com.aman.interfacechanges;

public interface A_1_ITest {

    public void display();

    default void subtract(){
        System.out.println("inside the A_1_iTest interface  default method ");
    }
   //The default methods in java 8 interface
     // will provide backward compatibility


    static void add(){
        System.out.println("In add method");
    }

// We can write Default and static methods in java 8 interface
 /*   default void show(){
        System.out.println("in show method");
    }

    static void add(){
        System.out.println("In add method");
    }
*/


}
