package com.aman.interfacechanges;

public class Example2 implements A_1_ITest {


    @Override
    public void display() {
        System.out.println("in Example 1 display ");
    }

    // can i override the default method


    @Override
    public void subtract() {
        System.out.println("Example 2 class overrident default subtract method ");

    }

    public void bd(){
        A_1_ITest.super.subtract();
    }

    public static void main(String[] args) {
        Example2 e2 = new Example2();
        e2.subtract();
        e2.bd();
    }
}
