package com.stackroute.junitpe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class WordFrequencyTest {
    private static WordFrequency wf;

    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        wf = new WordFrequency();
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        wf = null;
    }

    @Test
    public void checkWordFrequency() throws IOException {
        File file = new File("/home/ravali/Desktop/ravali.txt");
        assertEquals(1,(long)wf.checkWordFrequency(file.getAbsolutePath()));
        assertNull("null is expected",wf.checkWordFrequency(""));
    }

}