package com.ss.mar.jb.assigmentWkOne;

import java.util.Scanner;

public class Lambdas {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        String userChoices;

        int userint=0;


        while(userint!=4){
            try{
                System.out.println("PLease choose from the following choices and the enter the number to check:");
                System.out.println(" 1. To check if the number is Odd");
                System.out.println(" 2. To check if the number is a prime");
                System.out.println(" 3. To check if the number is a palindrome");
                System.out.println(" 4. To exit the program");
                userChoices= userInput.nextLine();
                String[] str = userChoices.split(" ");

                if(!checkInputVals(str)) userint=4;
                System.out.println();

            } catch (Exception e){
                String incorrectValue = userInput.nextLine();
                System.out.println("Sorry incorrect Value: "+incorrectValue);
                System.out.println("Please try again!");

            }

        }

    }

    public static boolean checkInputVals(String[] userInfo) {

        try{
            int userint= Integer.parseInt(userInfo[0]);
            boolean answer;
            boolean continues = false;
            NumInterface operations;
            int userNum =-1;

            if(userint>0 && userint<4){
                userNum= Integer.parseInt(userInfo[1]);
            }
            switch (userint){
                case 1:
                    operations = mathOperations.isOdd();
                    answer= mathOperations.operate(operations, userNum);
                    if (!answer) {
                        System.out.print("EVEN");
                    } else {
                        System.out.print("ODD");
                    }
                    continues = true;
                    break;

                case 2:
                    operations = mathOperations.isPrime();
                    answer = mathOperations.operate(operations, userNum);
                    if (answer) {
                        System.out.print("PRIME");
                    } else {
                        System.out.print("COMPOSITE");
                    }
                    continues = true;
                    break;

                case 3:
                    operations = mathOperations.isPalindrome();
                    answer = mathOperations.operate(operations, userNum);
                    if (answer) {
                        System.out.print("PALINDROME");
                    } else {
                        System.out.print("NOT A PALINDROME");
                    }
                    continues = true;
                    break;

                case 4:
                    System.out.print("Thanks for using the program!");
                    continues =  false;
                    break;

                default:
                    System.out.print("Please try again!");
                    break;
            }

            return continues;
        }catch (Exception e){

            System.out.print("Invalid choice, please try again!");
            return true;

        }
    }

}


/**
 * Operations as lambdas using the Numinterface
 */
class mathOperations{
    public static boolean operate(NumInterface i, int num){
        return i.operation(num);
    }

    public static NumInterface isOdd(){
        return num -> (num % 2!=0);
    }

    public static NumInterface isPrime(){
        return num -> {
            //test edge cases & if even
            if(num <=1) return false;
            else if (num == 2) return true;
            else if (num % 2 == 0) return false;
            //normal tests
            for(int i =3; i<Math.sqrt(num); i+=2){
                if(num % i ==0 ) return false;
            }

            return true;
        };
    }

    public static NumInterface isPalindrome(){

        return num -> {
            StringBuilder str = new StringBuilder();
            return num == Integer.parseInt(str.append(num).reverse().toString());
        };
    }
}


