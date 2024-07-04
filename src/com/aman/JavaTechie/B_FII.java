package com.aman.JavaTechie;

@FunctionalInterface
public interface B_FII {

    void m2();

     default  void m3(){
         System.out.println("default method ");
     }

     static  void m4 (){
         System.out.println("static method ");
     }
}
