package com.stackroute.junitpe2;

public class Factorial {


    public Factorial() {

    }
   /* Int Factorials:
    The factorial of 1 is 1
    The factorial of 2 is 2
            ..........
    The factorial of 12 is 479001600
    he factorial of 13 is out of range*/

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

   /* Long Factorials:
    The factorial of 1 is is 1.
    The factorial of 2 is is 2.
            ..........
    The factorial of 20 is is 2432902008176640000.
    The factorial of 21 is out of range.*/

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