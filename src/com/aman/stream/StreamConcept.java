package com.aman.stream;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class  Employee implements Comparable<Employee>{

    private  int id;
    private double empSalary;
    private  String empName;

    public Employee(int id, double empSalary, String empName) {
        this.id = id;
        this.empSalary = empSalary;
        this.empName = empName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empSalary=" + empSalary +
                ", empName='" + empName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return compare(this,o);
    }
    public static int compare(Employee e1, Employee e2) {
        return (e1.getId() < e2.getId()) ? -1 : ((e1.getId() == e2.getId()) ? 0 : 1);
    }
}
public class StreamConcept {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();

        l.add(4);
        l.add(23);
        l.add(12);
        l.add(122);

        //Stream  used to perform operation on the collection

        // three ways we can create stream
                //1st of() present in Stream interface
          Stream.of(1, 2, 3, 4);

                //2nd way  empList.stream()

        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(1,3423324,"kk"));
        empList.add(new Employee(2,3422324,"kt"));
        empList.add(new Employee(3,342114,"kre"));
        empList.add(new Employee(4,34231133,"kkg"));
        empList.add(new Employee(5,3423324,"ta"));
        empList.add(new Employee(6,342332134,"kd"));

        //write a program to pring employee name whose name is starting with k
//        for (int i = 0; i<empList.size(); i++){
//            if (empList.get(i).getEmpName().startsWith("t")){
//                System.out.println(empList.get(i).getEmpName());
//            }
//        }
               //1 filter(Predicate)
        empList.stream().filter((r)->r.getEmpName().startsWith("t")).forEach((t)-> System.out.println(t.getEmpName()));


        List<String> l3 = new ArrayList<>();
        l3.add("ram");
        l3.add("shyam");

        l3.stream().filter((r)->r.startsWith("s")).forEach((e)-> System.out.println(e));


        //write  a program to collect emp name to a seperate list from empLIst

       // map(Function) intermediate operation
        empList.stream().map((r)->r.getEmpName());
        //System.out.println( empList.stream().map((r)->r.getEmpName()));


       // empList.stream().map((r)->r.getEmpName())  Here we can not use forEach bcoz it do
        // not return anything we need to use collect()

        List<String> empNames = empList.stream().map((r) -> r.getEmpName()).collect(Collectors.toList());

        empNames.forEach((y)-> System.out.println(y));

        //Intermediate operation-> does not provide output
           // filter(Predicate)
           //map(Function)
        //Terminal operation -> which provides output
            // forEach(Consumer)
            //collect(Collectors.toList());

        //Q. write a lambda exp to print even numbers from list

        List<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(22);
        numbers.add(24);
        numbers.add(25);
        numbers.add(26);
        numbers.add(27);
        numbers.stream().filter((a) -> a % 2 == 0).forEach((u)-> System.out.print(u+" "));
        System.out.println();
        Set<Integer> even = numbers.stream().filter((a) -> a % 2 == 0).collect(Collectors.toSet());
       even.forEach((i)-> System.out.print(i));





    }



}
