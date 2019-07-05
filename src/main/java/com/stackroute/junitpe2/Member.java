package com.stackroute.junitpe2;

public class Member {
    //These variables are instance variables.
    //These variables are in a class and are not inside any function

    String name;
    int age;
    double salary;


    public class Membervariable{

        Member member = new Member();

        public Member setMember(String name, int age, double salary)
        {
            member.name = name;
            member.age = age;
            member.salary = salary;
            return member;
        }

    }
}

