package com.ss.mar.jb.assigmentWkOne;

import java.util.List;

public class FunctionalUtils {

    public List<Integer> rightNums(List<Integer> userArr){
        userArr.replaceAll(el -> el % 10);
        return userArr;
    }

    public List<Integer> doubleArr(List<Integer> userArr){
        userArr.replaceAll(el-> el * 2);
        return userArr;
    }


    public List<String> removeX(List<String> userArr){
        userArr.replaceAll(el->el.replace("x", ""));
        return userArr;
    }

}
