package com.stackroute.junitpe2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordFrequency {
   /* Create a file named FileDemo.txt with the following content
    i am a man ,
    i like to sleep ,
    i have a home.
    Output: i->3 times,
    am-1,
    like -1,
    have -1,
    a-2 etc.,*/
    public Integer checkWordFrequency(String inputPath) throws IOException
    {
        if(inputPath.equals(""))
            return null;
        BufferedReader bufferedReader=new BufferedReader(new FileReader(inputPath));
        int len=0;
        String st;
        while ((st=bufferedReader.readLine())!=null){
            len+=st.split(" ").length;//split the string based on space
        }
        return len;
    }
}
