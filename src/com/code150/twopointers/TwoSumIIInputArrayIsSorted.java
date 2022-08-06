package com.code150.twopointers;

import java.util.HashMap;

public class TwoSumIIInputArrayIsSorted {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(nums[i])) {
                int firstIndex = prevMap.get(num);
                firstIndex++;
                int secondIndex = i;
                secondIndex++;
                return new int[]{firstIndex, secondIndex};
            }

            prevMap.put(diff, i);
        }

        return new int[]{};
    }


//    public int[] twoSum(int[] numbers, int target) {
//        int a_pointer = 0;
//        int b_pointer = numbers.length - 1;
//        int num_a, num_b;
//
//        while (a_pointer < b_pointer) {
//            num_a = numbers[a_pointer];
//            num_b = numbers[b_pointer];
//
//            if (num_a + num_b == target) break;
//
//            if (num_a + num_b < target) {
//                a_pointer++;
//                continue;
//            }
//
//            b_pointer--;
//        }
//
//        return new int[] { a_pointer + 1, b_pointer + 1 };
//    }
}
