package com.stackroute.junitpe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest extends Palindrome {
    Palindrome palindrome;
    @Before
    public void setUp() {

        System.out.println("Before");
        palindrome = new Palindrome();
    }

    @After

    public void tearDown() {
        System.out.println("After");
        palindrome = null;

    }
    @Test
    public void givenNumberShouldReturnPalindrome(){

        //arrange

        //act

        String result= palindrome.palin(2888882);
        //assert
        assertEquals("Given Number is Palindrome",result);

    }

    @Test
    public void givenNumberShouldReturnNotPalindrome(){

        //arrange

        //act

        String result= palindrome.palin(211113);

        //assert
        assertEquals("Give Number is Not palindrome",result);

    }

}