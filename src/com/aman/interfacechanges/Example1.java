package com.aman.interfacechanges;

public class Example1 implements A_1_ITest {


    @Override
    public void display() {
        System.out.println("in Example 1 display ");
    }

    public void abc(){
        //InterfaceName.super.defaultMethodName()
        A_1_ITest.super.subtract();

    }

    static void add(){
        System.out.println("in add method ");
    }

    public static void main(String[] args) {

        //i cant call this here becoz we are inside static method and  a static methos
         // can only call other static method
       // A_1_ITest.super.subtract();

        //Another way we used by creating a instance method and inside the instance method
        // we are calling the default method using interface

        Example1 e1 = new Example1();
        e1.abc();



        //calling the static method
        // InterfaceName.staticMethodName();
        A_1_ITest.add();

        // we cant override static method why read notes
        Example1.add();
    }
}
