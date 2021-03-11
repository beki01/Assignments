package com.ss.mar.jb.three;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CountSameCharaInFile {

    /**
     * Looks for Characters in resources/three.txt
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String currentLine;
        char charToLookFor;
        int count = 0;

        //ask user for char to look for. Will take the first char of string.
        System.out.println("Please enter what character you would like to look for in three.txt: ");
        charToLookFor = userInput.next().charAt(0);

        //Read the file & then search for char
        try {
            Scanner file = new Scanner(new FileReader("resources/three.txt"));

            while (file.hasNextLine()) {
                currentLine = file.nextLine();
                for (int i = 0; i < currentLine.length(); i++) {
                    if (currentLine.charAt(i) == charToLookFor) count++;
                }
            }

            //Print Results of search
            if (count > 0) System.out.println("Found char " + charToLookFor + ": " + count + " times.");
            else System.out.println("Character " + charToLookFor + " not found in file!");

        } catch (FileNotFoundException e) {
            System.out.println("File not Found.");
            e.printStackTrace();
        }

    }
}
