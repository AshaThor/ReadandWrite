package com.ashleydenham.ReadandWrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            /*
            * This software will read in a file and then output the reverec of that files contence (Formatted doc required)
            * */
            //Create Array for file to be stored in
            String[] readFile;
            //Initalise the file reader
            BufferedReader reader = new BufferedReader(new FileReader(".\\src\\read.txt"));
            //This next code checks the first line of the text document to see how big to make the array
            int fileLength;
            String firstLine = reader.readLine();
            fileLength = Integer.parseInt(firstLine);
            //Sets the array to one less than the length of the file
            readFile = new String[fileLength-1];
            //Runs through the file and places each of the lines in the correct array position
            for(int i=1; i < fileLength; i++){
                String nextLine = reader.readLine();
                readFile[(i-1)] = nextLine;
                //Debug code for checking all values are in the array
                System.out.println(readFile[i-1]);
            }
            /*
            * Sexy conversion magic happens here
            * this following code converts the array to a list, inverts the list and then converts the list back to an array
            * */
            List<Object> list = Arrays.asList(readFile);
            Collections.reverse(list);
            String[] reverceReadFile = list.toArray(new String[0]);
            //Debug code for spitting out a the revereced list
            System.out.println(list);
            //Now time to put it all back in
            for (String x : reverceReadFile){
                System.out.println(x);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}