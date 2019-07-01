package com.stackroute.junitpe2;

public class PowerOfFour {
    public String isPowerOfFour(int n)
    {
        if(n == 0)
            return null;
        while(n != 1)
        {
            if(n % 4 != 0)
                return "number is not power of four";
            n = n / 4;
        }
        return "number is power of four";
    }
}
