package com.stackroute.junitpe2;

import org.junit.*;

import static org.junit.Assert.*;

public class FolderFileReaderTest {


        public static FolderFileReader folderFileReader;

        @Before
        public  void setUp()
        {
            folderFileReader = new FolderFileReader();
        }

        @After
        public  void tearDown()
        {
            folderFileReader = null;
        }

        @Test
        public void testForGetTextFilenamesOfFolder()
        {
            String[] filenames = folderFileReader.getFolderFilenames("/home/ravali/Desktop", "txt");

            assertEquals(1,filenames.length);

            assertEquals("ravali.txt", filenames[0]);


        }

        @Test()
        public void testForGetPdfFilenamesOfFolder()
        {
            String[] filenames = folderFileReader.getFolderFilenames("/home/ravali/Desktop", "pdf");

            assertEquals(3,filenames.length);

            assertEquals("pe2.pdf", filenames[0]);
            assertEquals("pe3.pdf", filenames[1]);
            assertEquals("pe4.pdf", filenames[2]);
        }


        @Test()
        public void testForGetFilenamesOfFolderFailure()
        {
            String[] filenames = folderFileReader.getFolderFilenames("/home/ravali/Desktop/lib", "pdf");

            assertNull(null,filenames);

        }
    }


