package com.code150.twopointers;

public class TrappingRainWater {
    public static void main(String[] args) {
        System.out.println(trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        System.out.println(trap(new int[]{4, 2, 0, 3, 2, 5}));
    }

    public static int trap(int[] height) {
        int n = height.length;
        if (n <= 2) {
            return 0;
        }

        int trap = 0;
        int[] maxFromLeft = new int[n];
        int[] maxFromRight = new int[n];

        maxFromLeft[0] = height[0];
        maxFromRight[n - 1] = height[n - 1];

        for (int i = 1; i < n; i++) {
            maxFromLeft[i] = Math.max(height[i], maxFromLeft[i - 1]);
        }

        for (int j = n - 2; j >= 0; j--) {
            maxFromRight[j] = Math.max(height[j], maxFromRight[j + 1]);
        }

        for (int k = 0; k < n; k++) {
            trap += (Math.min(maxFromLeft[k], maxFromRight[k]) - height[k]);
        }

        return trap;
    }
}
