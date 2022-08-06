package com.code150.arrayandhashing;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(nums[i])) {
                return new int[]{prevMap.get(num), i};
            }

            prevMap.put(diff, i);
        }

        return new int[]{};
    }


//    public static int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new LinkedHashMap<>();
//        int rem;
//
//        for (int i = 0; i < nums.length; i++) {
//            rem = target - nums[i];
//            if (map.values().contains(rem)) {
//                return new int[]{getKey(map, rem), i};
//            } else {
//                map.put(i, nums[i]);
//            }
//        }
//
//        return new int[]{-1, -1};
//    }

//    private static Integer getKey(Map<Integer, Integer> map, int value) {
//        return map.entrySet().stream().filter(entry -> value == entry.getValue()).map(Map.Entry::getKey).findFirst().orElse(0);
//    }
}
