package com.aman.aitcollectionchanges;

//forEach
import java.util.ArrayList;
import java.util.List;

class  Employee{

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
}
public class B_Enhancement2 {

    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(1,3423324,"kk"));
        empList.add(new Employee(2,3422324,"kt"));
        empList.add(new Employee(3,342114,"kre"));
        empList.add(new Employee(4,34231133,"kkg"));
        empList.add(new Employee(5,3423324,"ta"));
        empList.add(new Employee(6,342332134,"kd"));

        for (int i = 0; i<empList.size(); i++){

            System.out.println(empList.get(i).getId() + " "+ empList.get(i).getEmpName()+" "+empList.get(i).getEmpSalary());

        }
        empList.forEach((c)-> System.out.println(c.getId()+" "+c.getEmpSalary()+" " + c.getEmpName()));

empList.removeIf(p->p.getEmpName().startsWith("t"));

        empList.forEach((c)-> System.out.println(c.getId()+" "+c.getEmpSalary()+" " + c.getEmpName()));

    }
}
