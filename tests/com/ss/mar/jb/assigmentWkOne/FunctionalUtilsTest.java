package com.ss.mar.jb.assigmentWkOne;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FunctionalUtilsTest {
    FunctionalUtils myUtils = new FunctionalUtils();
    Integer[] arrOne = {2, 33, 2, 59, 2621};
    Integer[] arrTwo = {1, 2, 3};
    Integer[] arrThree = {16, 8, 886, 8, 1};
    Integer[] arrFour = {6, 8, 6, 8, -1};
    Integer[] arrFive = {};
    String[] arrSix = {"xxax", "xbxbx", "xxcx"};
    String[] arrSeven = {"ax", "bb", "cx"};
    List<Integer> useCaseOne = Arrays.asList(arrOne);
    List<Integer> useCaseTwo = Arrays.asList(arrTwo);
    List<Integer> useCaseThree = Arrays.asList(arrThree);
    List<Integer> useCaseFour = Arrays.asList(arrFour);
    List<Integer> useCaseFive = Arrays.asList(arrFive);
    List<String> useCaseSix = Arrays.asList(arrSix);
    List<String> useCaseSeven = Arrays.asList(arrSeven);

    Integer[] aArrOne = {2, 3, 2, 9, 1};
    Integer[] aArrTwo = {1, 2,3};
    Integer[] aArrThree = {32,16,1772, 16,2};
    Integer[] aArrFour = {12,16,12,16,-2};
    Integer[] aArrFive = {};
    String[] aArrSix = {"a", "bb", "c"};

    List<Integer> answerOne = Arrays.asList(aArrOne);
    List<Integer> answerTwo = Arrays.asList(aArrTwo);
    List<Integer> answerThree = Arrays.asList(aArrThree);
    List<Integer> answerFour = Arrays.asList(aArrFour);
    List<Integer> answerFive = Arrays.asList(aArrFive);
    List<String> answerSix = Arrays.asList(aArrSix);


    @Test
    void rightNums() {
        assertEquals(answerOne,  myUtils.rightNums(useCaseOne));
        assertEquals(answerTwo, myUtils.rightNums(useCaseTwo));
    }

    @Test
    void doubleArr() {
        assertEquals(answerThree, myUtils.doubleArr(useCaseThree));
        assertEquals(answerFour, myUtils.doubleArr(useCaseFour));
        assertEquals(answerFive, myUtils.doubleArr(useCaseFive));

    }

    @Test
    void removeX() {
        assertEquals(answerSix, myUtils.removeX(useCaseSix));
        assertEquals(answerSix, myUtils.removeX(useCaseSeven));
    }
}