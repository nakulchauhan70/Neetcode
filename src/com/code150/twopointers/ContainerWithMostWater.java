package com.code150.twopointers;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 1;

        while (left < right) {
            int length = right - left;
            int lh = height[left];
            int rh = height[right];

            int minHeight = Math.min(lh, rh);
            area = Math.max(area, minHeight * length);

            if (lh < rh) {
                left++;
            } else {
                right--;
            }
        }

        return area;
    }
}
