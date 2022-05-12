package com.account.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

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
    public int compareTo(Employee emp1){
        if (eno<emp1.getEno())
        return -1;
        else if(eno > emp1.getEno())
        return +1;
        else 
        return 0;
    }
}

public class ArrayListEmplDemo {
    public static void main(String[] args) {
        Employee emp = new Employee(100, "Test");
        Employee emp2 = new Employee(45, "Test2");
        Employee emp3 = new Employee(124, "Test3");
        ArrayList <Employee> addExployee = new ArrayList<>(); 
        addExployee.add(emp);
        addExployee.add(emp2);
        addExployee.add(emp3);
        Collections.sort(addExployee);
        for(Employee em : addExployee){
            System.out.println(em.getEname()+" " +em.getEno());
        }
    }
}
