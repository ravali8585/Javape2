package com.stackroute.junitpe2;

public class Factorial {


    public Factorial() {

    }

    public String intfactorial(int number) {
        int fact = 1;

        while (number > 0) {
            fact = fact * (number--);
        }
        System.out.println(fact);

        if (fact < 0) {
            return "factorial out of range";
        } else {
            return fact + "";
        }
    }


    public String longfactorial(int number) {
        long fact = 1;

        while (number > 0) {
            fact = fact * (number--);
        }
        System.out.println(fact);

        if (fact < 0) {
            return "factorial out of range";
        } else {
            return fact + "";
        }

    }
}