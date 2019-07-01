package com.stackroute.junitpe2;

import org.junit.*;

import static org.junit.Assert.*;

public class StudentGradesTest {



        public static StudentGrades studentGrades;

        @BeforeClass
        public static void setUp()
        {
            studentGrades = new StudentGrades();
        }

        @AfterClass
        public static void tearDown()
        {
            studentGrades = null;
        }

        @Test
        public void testForGradeCalculatorSuccess()
        {
            int[] grades = {80,70,60,78};
            StudentGrades.Result result = studentGrades.calculateGrades(4,grades);
            assertEquals(288,result.average,00);
            assertEquals(60,result.minimun);
            assertEquals(80,result.maximum);
        }

        @Test
        public void testForGradeCalculatorFailureWithInvalidInput()
        {
            int[] grades = {80,70,60,78, 465767};
            StudentGrades.Result result = studentGrades.calculateGrades(4,grades);
            assertEquals(null,result);
        }

        @Test
        public void testForGradeCalculatorFailureWithOutOfRangeInput()
        {
            int[] grades = {80,70,60,78,178};
            StudentGrades.Result result = studentGrades.calculateGrades(4,grades);
            assertEquals(null,result);
        }


    }