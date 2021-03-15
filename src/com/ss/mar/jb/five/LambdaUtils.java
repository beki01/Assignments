package com.ss.mar.jb.five;


public class LambdaUtils {

    public static int beginsWithSort(Words w1, Words w2) {
        if (w1.getStr().substring(0, 1).equalsIgnoreCase("e")) {
            return -1;
        } else if (w2.getStr().substring(0, 1).equalsIgnoreCase("e")) {
            return 1;
        }

        return (w1.getStr().compareTo(w2.getStr()));
    }
}
