package com.code150.arrayandhashing;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
    }

    public static int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int zeroCount = 0;

        for (int num : nums) {
            if (num != 0) {
                prod *= num;
            } else {
                zeroCount++;
            }

            if (zeroCount == 2) {
                Arrays.fill(nums, 0);
                return nums;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && zeroCount == 1) {
                nums[i] = 0;
            } else if (nums[i] == 0) {
                nums[i] = prod;
            } else {
                nums[i] = prod / nums[i];
            }
        }

        return nums;
    }
}
