package com.aman.lambdaexpression2;

public class D_Example {

    public static void main(String[] args) {
         Thread t = new Thread(new Runnable() {
             @Override
             public void run() {

             }
         });

         //we can replace the annonymous inner class with the lambda expression

         Thread t1 = new Thread(()->{
             System.out.println("calling run method");
         });
    }
}
