package com.ss.mar.jb.assigmentWkOne;

import java.util.Arrays;
import java.util.List;

public class Functional {

    public static void main(String[] args){
        Integer[] arrOne = {2, 33, 2, 59, 2621};
        Integer[] arrTwo = {1, 2, 3};
        Integer[] arrThree = {16, 8, 886, 8, 1};
        Integer[] arrFour = {6, 8, 6, 8, -1};
        Integer[] arrFive = {};
        String[] arrSix = {"xxax", "xbxbx", "xxcx"};
        String[] arrSeven = {"ax", "bb", "cx"};
//        Integer[] arrSeven = {1, 2, 3};
//        Integer[] arrEight = {1, 2, 3};
        List<Integer> useCaseOne = Arrays.asList(arrOne);
        List<Integer> useCaseTwo = Arrays.asList(arrTwo);
        List<Integer> useCaseThree = Arrays.asList(arrThree);
        List<Integer> useCaseFour = Arrays.asList(arrFour);
        List<Integer> useCaseFive = Arrays.asList(arrFive);
        List<String> useCaseSix = Arrays.asList(arrSix);
        List<String> useCaseSeven = Arrays.asList(arrSeven);

        FunctionalUtils myUtils = new FunctionalUtils();

        //Right nums of each element of an array
        List<Integer> resultOne = myUtils.rightNums(useCaseOne);
        resultOne.forEach(num -> System.out.print(num + " "));
        System.out.println();
        List<Integer> resultTwo = myUtils.rightNums(useCaseTwo);
        resultTwo.forEach(num -> System.out.print(num + " "));
        System.out.println();

        //Double the elements in arrays
        List<Integer> resultThree = myUtils.doubleArr(useCaseThree);
        resultThree.forEach(num -> System.out.print(num + " "));
        System.out.println();
        List<Integer> resultFour = myUtils.doubleArr(useCaseFour);
        resultFour.forEach(num -> System.out.print(num + " "));
        System.out.println();
        List<Integer> resultFive = myUtils.doubleArr(useCaseFive);
        resultFive.forEach(num -> System.out.print(num + " "));
        System.out.println();


        //Remove 'x'
        List<String> resultSix = myUtils.removeX(useCaseSix);
        resultSix.forEach(el -> System.out.print(el + " "));
        System.out.println();
        List<String> resultSeven = myUtils.removeX(useCaseSeven);
        resultSeven.forEach(el -> System.out.print(el + " "));
        System.out.println();

    }
}
