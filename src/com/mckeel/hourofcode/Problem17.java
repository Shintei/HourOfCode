package com.mckeel.hourofcode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by Chandan and Sharon on 12/6/2018.
 */
public class Problem17 {
    private static final String INPUT_FILE_NAME = "src/resources/Prob17.in.txt";

    public static String outputBoard(){
        String answer = null;
        File inFile = new File(INPUT_FILE_NAME);
        try(FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr)){
            //TODO: You can use the Buffered Reader object br to get lines from our input file! Try writing 'br.' and see what methods are available.

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        //TODO: Return the string containing your answer, use System.lineSeparator for line breaks";
        return "...";
    }
}
