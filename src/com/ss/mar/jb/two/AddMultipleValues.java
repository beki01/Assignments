package com.ss.mar.jb.two;

import java.util.Scanner;

public class AddMultipleValues {
    /**
     * Takes user inputs and displays final sum when a non numerical value is entered.
     *
     */
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        double currentAmt = 0, amtToAdd;
        boolean isDouble = true;

        System.out.println("Please enter initial numeric amount to add.");
        System.out.println("(Use any non numerical character to display final calculation).");
        do {
            try {
                amtToAdd = userInput.nextDouble();
                currentAmt += amtToAdd;
                System.out.println("Enter next amount.");

            } catch (Exception e){
                isDouble=false;
                System.out.println("You have entered a non-numerical character.");
                System.out.println("Calculated total is "+ currentAmt);
            }
        } while (isDouble);


    }
}
