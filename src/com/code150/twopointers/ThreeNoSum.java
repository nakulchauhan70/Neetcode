package com.code150.twopointers;

import java.util.*;

public class ThreeNoSum {

    public static void main(String[] args) {

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        Set<List<Integer>> thriplets = new HashSet<>();

        //if x + y + z = 0 then y + z = -x is also true
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int first = i + 1;
            int second = nums.length - 1;

            while (first < second) {
                int firstSecondSum = nums[first] + nums[second];
                if (firstSecondSum == -nums[i]) {
                    thriplets.add(List.of(nums[i], first, second));
                    first++;
                    second--;
                } else if (firstSecondSum > -nums[i]) {
                    second--;
                } else if (firstSecondSum < -nums[i]) {
                    first++;
                }
            }
        }

        return new ArrayList<>(thriplets);
    }
}
