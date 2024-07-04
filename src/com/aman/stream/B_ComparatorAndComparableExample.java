package com.aman.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class B_ComparatorAndComparableExample {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(120);
        l.add(54);
        l.add(10);
        l.add(20);
        System.out.println(l);

        //write program to sort the list (Asc)
        Collections.sort(l);
        System.out.println(l);

        Collections.sort(l, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        System.out.println(l);


        // program to print min numbers
        // program to print max number

        l.stream().min((t1,t2)->(t1<t1) ? -1 : ((t1==t1)?0:1)).get();

        System.out.println( l.stream().min((t1,t2)->(t1<t2) ? -1 : ((t1==t2)?0:1)).get());

        System.out.println( l.stream().max((t1,t2)->(t1<t2) ? -1 : ((t1==t2)?0:1)).get());


        //write a program to print empName who is getting max salary

        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(1,500000,"kkas"));
        empList.add(new Employee(2,34223,"ktas"));
        empList.add(new Employee(3,342114,"kreas"));
        empList.add(new Employee(4,342311,"kkg"));
        empList.add(new Employee(5,3423324,"taas"));
        empList.add(new Employee(6,3423321,"kdas"));

        Employee employee1 = empList.stream().max((t3, t4) -> (t3.getEmpSalary() < t4.getEmpSalary() ? -1 : ((t3.getEmpSalary() == t4.getEmpSalary()) ? 0 : 1))).get();
        Employee employee = empList.stream().min((t3, t4) -> (t3.getEmpSalary() < t4.getEmpSalary() ? -1 : ((t3.getEmpSalary() == t4.getEmpSalary()) ? 0 : 1))).get();

        System.out.println(employee.getEmpSalary());

        //write a program to sort the list using stream api

         l.stream().sorted().forEach((t)-> System.out.print(t + " "));
          //descending order
        System.out.println();
        List<Integer> collect = l.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect);
            //Employye sorted based on id
        empList.stream().sorted().forEach((r)-> System.out.print(r));

        //desc
        empList.stream().sorted(Collections.reverseOrder()).forEach((r)-> System.out.print(r));

        System.out.println();
        //S-9
        // REmove the duplicates from the list
        l.stream().distinct().forEach((i)-> System.out.print(i +" "));
        System.out.println();
        //write p to count number of duplicate elements
        int i = (int) ((int) l.size() - l.stream().distinct().count());
        System.out.println(i);
    }


}
