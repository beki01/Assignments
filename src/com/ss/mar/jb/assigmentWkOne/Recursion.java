package com.ss.mar.jb.assigmentWkOne;

public class Recursion {

    public static void main(String[] args) {

        Integer[] userArr = {2, 2, 3, 9};
        boolean isPossible = groupSumClump(0, userArr, 10);
        System.out.println("Is it possible? " + isPossible);
    }

    public static boolean groupSumClump(int index, Integer[] nums, int targetNum) {
        int sum = 0;
        int count = 1;

        if (nums.length <= index) return targetNum == 0;

        sum = nums[index];
        for (int i = index + 1; i < nums.length; i++)
            if (nums[i].equals(nums[index])) {
                sum += nums[i];
                count++;
            }
        return groupSumClump(index + count, nums, targetNum - sum) || groupSumClump(index + count, nums, targetNum);
    }


}