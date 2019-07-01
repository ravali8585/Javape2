package com.stackroute.junitpe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest extends PowerOfFour {
    PowerOfFour pof;
    @Before
    public void setUp() {

        System.out.println("Before");
        pof = new PowerOfFour();
    }

    @After

    public void tearDown() {
        System.out.println("After");
        pof= null;

    }
    @Test
    public void givenNumberShouldReturnNotpowerOfFour(){

        //arrange

        //act

        String result= pof.isPowerOfFour(60);
        //assert
        assertEquals("number is not power of four",result);

    }

    @Test
    public void givenNumberShouldReturnNotPowerOfFour(){

        //arrange

        //act

        String result= pof.isPowerOfFour(64);

        //assert
        assertEquals("number is power of four",result);

    }


}