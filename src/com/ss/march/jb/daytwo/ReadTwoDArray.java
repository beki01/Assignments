package com.ss.march.jb.daytwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadTwoDArray {

    /**
     * @param args main function
     */
    public static void main(String[] args) {
        List<Double[]> userArr ;
        Double highestNum = null;

        userArr = retrieveArray();
        if (userArr != null) {
            // Need Double loop to access inner arrays
            for (Double[] tempList: userArr) {
                for (Double tempNum : tempList) {
                    if(highestNum==null) highestNum= tempNum;
                    else if(tempNum>highestNum) highestNum=tempNum;
                }
            }
            System.out.println("Highest Number from the Array is: "+ highestNum);
        } else {
            System.out.println("Sorry something went wrong retrieving the array. Please try again!");
        }

    }

    /**
     * Returns ArrayList from txt file catches IOException
     * @return ArrayList
     */
    public static List<Double[]> retrieveArray() {
        List<Double[]> userArr = null;
        try {
            userArr = readFromFile("array.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return userArr;
    }

    /**
     * Read from text file from local and returns a dynamically built 2D array.
     *
     * @param filepath name of file
     * @return ArrayList from text file
     * @throws IOException if file not found
     */

    public static List<Double[]> readFromFile(String filepath) throws IOException {
        Double[] temp;
        List<Double[]> result = new ArrayList<>();

        InputStream is = ReadTwoDArray.class.getResourceAsStream(filepath);
        BufferedReader arr = new BufferedReader(new InputStreamReader(is));

        String str;

        while ((str = arr.readLine()) != null) {
            String[] numbers = str.split(" ");
            temp = new Double[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                temp[i] = (Double.parseDouble(numbers[i]));
            }
            result.add(temp);

        }

        is.close();
        return result;

    }
}

