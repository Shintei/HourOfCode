package com.mckeel.hourofcode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by Chandan and Sharon on 12/6/2018.
 */
public class Problem2 {
    private static final String INPUT_FILE_NAME = "src/resources/Prob02.in.txt";

    public static String removeCharacter(){
        String answer = null;
        File inFile = new File(INPUT_FILE_NAME);
        try(FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr)){
            //TODO: You can use the Buffered Reader object br to get lines from our input file! Try writing 'br.' and see what methods are available.

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        //Return the string containing your answer
        return "...";
    }
}
