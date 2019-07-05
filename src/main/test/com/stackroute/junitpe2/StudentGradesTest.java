package com.stackroute.junitpe2;

import org.junit.*;

import static org.junit.Assert.*;

public class StudentGradesTest {



    StudentGrades studentGrades;

    @Before
    public void setUp() throws Exception {
        studentGrades=new StudentGrades();
    }

    @After
    public void tearDown() throws Exception {
        studentGrades=null;
    }

    @Test
    public void toreturnAverageOfAllStudents() {
        int inputArray[]={25,25,25,25};
        assertEquals(25,studentGrades.average(inputArray));
        assertNotEquals(100,studentGrades.average(inputArray));
    }
    @Test
    public void averageExceeded() {
        int inputArray[]={25,25,101,25};
        assertNotNull("Null is not Expected!",studentGrades.average(inputArray));
    }

    @Test
    public void toReturnLowestValueInStudentMarks() {
        int inputArray[]={49,33,34,57};
        assertEquals(33,studentGrades.lowest(inputArray));
        assertNotEquals(49,studentGrades.lowest(inputArray));
    }

    @Test
    public void toReturnHighesttValueInStudentMarks() {
        int inputArray[]={241,243,2504,294};
        assertEquals(2504,studentGrades.highest(inputArray));
        assertNotEquals(294,studentGrades.highest(inputArray));
    }

    }