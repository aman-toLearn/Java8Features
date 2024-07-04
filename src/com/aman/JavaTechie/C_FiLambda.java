package com.aman.JavaTechie;


interface Calculator{
   // void calculate();
    //void sum(int input);

    int sum(int a, int b);
}
public class C_FiLambda  {



    public static void main(String[] args) {
//        Calculator cal = ()-> System.out.println("calculaet ");
//
//        cal.calculate();

//        Calculator c = (in)->{
//            System.out.println(in+5);
//        };
//
//        c.sum(5);

       Calculator cal =  (a,b)->{if(a<b){
           throw  new RuntimeException("msg");
       }
       else {
       return a+b;}
       };

       cal.sum(8,4);
    }




}
