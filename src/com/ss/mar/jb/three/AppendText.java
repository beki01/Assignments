package com.ss.mar.jb.three;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class AppendText {

    /**
     * Appends text to end of three.txt file in resources.
     * 
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String textToAppend ;
        String fileName = "/three.txt";

        System.out.println("Please enter the text you would like to append to \"three.text\" in resources.");
        textToAppend="\n"+ userInput.nextLine();

        try {
            Files.write(Paths.get(fileName), textToAppend.getBytes(UTF_8), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Error Occurred!");
            e.printStackTrace();
        }
    }
}
