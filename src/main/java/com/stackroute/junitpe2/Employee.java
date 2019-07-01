package com.stackroute.junitpe2;

public class Employee {
    //These variables are instance variables.
    //These variables are in a class and are not inside any function


    String name;
    int age;
    double salary;


    public class Employeevariable {

        Employee emp = new Employee();

        public Employee setMember(String name, int age, double salary) {
            emp.name = name;
            emp.age = age;
            emp.salary = salary;
            return emp;
        }

    }
}
