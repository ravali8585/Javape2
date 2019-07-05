package com.stackroute.junitpe2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class ReadFile {
    public String getUpperCase(String inputFilepath) throws IOException {
        if(inputFilepath.equalsIgnoreCase(""))return null;
        File file=new File(inputFilepath);
        StringBuffer result=new StringBuffer("");
        BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
        String st;
        while ((st=bufferedReader.readLine())!=null){
            result.append(st).append("\n");
        }
        return result.toString().toLowerCase(Locale.ENGLISH).trim();
    }
}
