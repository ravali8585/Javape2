package com.stackroute.junitpe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckEvenTest {

        CheckEven check;
        @Before
        public void setUp() {

            System.out.println("Before");
            check = new CheckEven();
        }

        @After

        public void tearDown() {
            System.out.println("After");
            check= null;

        }
        @Test
        public void givenNumberShouldReturnEvenNumber(){

            //arrange

            //act

            boolean result= check.isEven(4);
            //assert
            assertEquals(true,result);

        }

        @Test
        public void givenNumberShouldReturnNotEvenNumber(){

            //arrange

            //act

            boolean result= check.isEven(3);

            //assert
            assertEquals(false,result);

        }


    }

