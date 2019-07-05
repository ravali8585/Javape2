package com.stackroute.junitpe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class ReadFileTest {
    private static ReadFile rf;


    @Before
    public  void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        rf = new ReadFile();

    }

    @After
    public void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        rf = null;
    }

    @Test
    public void getUpperCase() throws IOException {
        // getting the file from resources folder
        File file = new File("/home/ravali/Desktop/ravali.txt");
        assertEquals("ravali",rf.getUpperCase(file.getAbsolutePath()));
        assertNull("The return value should be null",rf.getUpperCase(""));
    }

}