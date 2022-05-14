package com.account.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

class Employee1 implements Comparable<Employee1>{
    int eno;
    String ename;
    public Employee1(int eno, String ename) {
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
    public int compareTo(Employee1 emp1){
    	return ename.compareTo(emp1.getEname());
    }
}



public class ArrayListEmplDemo {
    public static void main(String[] args) {
        Employee1 emp = new Employee1(100, "Test");
        Employee1 emp2 = new Employee1(85, "Check");
        Employee1 emp3 = new Employee1(124, "Find");
        Employee1 emp4 = new Employee1(115, "Test");
        ArrayList <Employee1> addExployee = new ArrayList<>(); 
        addExployee.add(emp);
        addExployee.add(emp2);
        addExployee.add(emp3);
        addExployee.add(emp4);
        Collections.sort(addExployee);
        for(Employee1 em : addExployee){
        	System.out.println(em.getEname()+" " +em.getEno());
        }
    }
}
