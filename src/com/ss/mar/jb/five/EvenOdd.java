package com.ss.mar.jb.five;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class EvenOdd {
    String evenOddStr;

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        StringBuilder finalStr = new StringBuilder();

        System.out.println("Please enter integers in a single line to determine if even or odd, separated by a \" \"");

        String userStr = userInput.nextLine();

        String[] str = userStr.split(" ");


        Stream<String> userStream = Arrays.stream(str);


        userStream.forEach(num -> {
            try{
                int newNum = Integer.parseInt(num);
                if (newNum % 2 == 0) {
                    finalStr.append("e").append(newNum);

                } else {
                    finalStr.append("o").append(newNum);
                }

            }catch (Exception e){
                System.out.println("Detected non-integer value: "+num+ " will be skipped.");
            }

            finalStr.append(", ");

        });

        finalStr.delete(finalStr.length() - 2, finalStr.length() - 1);

        System.out.println("Even Odd String: " + finalStr.toString());

    }

}
