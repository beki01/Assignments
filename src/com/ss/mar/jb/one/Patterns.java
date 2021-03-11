package com.ss.mar.jb.one;

/**
 * @author beki
 */
public class Patterns {

    /**
     * Prints half of up arrow
     */
    public static void printHalfUp(){
        for(int i =0; i<4; i++) {
            System.out.print(" ");

            for (int j = 0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Prints half of down arrow
     */
    public static void printHalfDown(){
        int i, j;
        int stars = 4;

        for( i =stars-1; i>=0; i--) {
            System.out.print(" ");
            for(j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    /**
     * Prints up triangle
     */
    public static void printUp(){

        int stars = 7;

        for (int i=0; i<stars; i++)
        {
            for (int j=stars-i; j>1; j--) {
                System.out.print(" ");
            }

            for (int j=0; j<=i; j++ ) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    /**
     * Print Down arrow
     */
    public static void printDown(){
        int stars=7;

        for(int i=1; i <= stars; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }

            for(int j = i; j <= stars; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * @param args - main function
     */
    public static void main(String[] args){
        System.out.println("Half up: ");
        printHalfUp();
        System.out.println("Half down: ");
        printHalfDown();
        System.out.println("Up: ");
        printUp();
        System.out.println("Down: ");
        printDown();
    }

}
