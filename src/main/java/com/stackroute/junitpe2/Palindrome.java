package com.stackroute.junitpe2;

public class Palindrome {
    public static String palin(int n) {
        int r, sum = 0, rev = 0, temp = n;

        while (n > 0) {
            r = n % 10;  //getting remainder
            rev = (rev * 10) + r;


            n = n / 10;
        }
        if (rev == temp)
        {
            return  "Given Number is Palindrome";
        }
        else
            {
                return "Give Number is Not palindrome";
            }

    }

}
