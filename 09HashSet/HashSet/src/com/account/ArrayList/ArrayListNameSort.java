package com.account.ArrayList;

import java.util.TreeSet;

class Employee implements Comparable<Employee>{
    int eno;
    String ename;

    public Employee(int eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

      public int compareTo(Employee emp1) {
    	 //return ename.compareTo(emp1.getEname());
        if (ename.compareTo(emp1.getEname()) <= 0) 
            return -1;
        else if (ename.compareTo(emp1.getEname()) > 0) 
            return +1;
        else
            return 0;
 
    } 
    
}

public class ArrayListNameSort {
    public static void main(String[] args) {
        Employee emp = new Employee(100, "Test");
        Employee emp2 = new Employee(45, "Apple");

        Employee emp4 = new Employee(75, "Project");
        Employee emp3 = new Employee(150, "Apple");
        TreeSet<Employee> addExployee = new TreeSet<>();
        addExployee.add(emp);
        addExployee.add(emp2);
        addExployee.add(emp4);
        addExployee.add(emp3);

        for (Employee em : addExployee) {
            System.out.println(em.getEname() + " " + em.getEno());
        }
    }
}
