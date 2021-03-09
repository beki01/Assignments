package com.ss.mar.jb;

import java.util.Scanner;

public class NumberGuess {
    /**
     * Generates random number and user guesses what it is. If within range & max attempts user wins, else they loose.
     *
     */
    public static void main(String[] args){

        Scanner guess = new Scanner(System.in);
        int guessCount = 0, userGuess = -50;
        int answer;
        int maxGuessCount = 5;

        answer = 1+ (int) (Math.random()*99);

        System.out.println("Please guess a number between 1-100");

        while(!((userGuess>=(answer-10)) && (userGuess<=(answer+10))) && guessCount<maxGuessCount){
            userGuess= guess.nextInt();

            guessCount++;

            if((userGuess>=(answer-10)) && (userGuess<=(answer+10))){
                System.out.println("Close Enough! Answer is "+ answer);
            } else if(userGuess> answer){
                System.out.println("too high");
            } else if(userGuess<answer){
                System.out.println("too low");
            }

            if(guessCount==maxGuessCount){
                System.out.println("Sorry! Exceeded the number of guesses! Answer is "+answer);
            }


        }

        System.out.println("Thanks for playing!");


    }
}
