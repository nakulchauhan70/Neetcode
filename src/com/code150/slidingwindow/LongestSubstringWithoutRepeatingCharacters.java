package com.code150.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abc12x345cxyz"));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        int result = 0;

        for (int right = 0; right < s.length(); right++) {
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left)); //abc123cdfe - remove no of characters till c from initial abc is removed, for index 4(c) remove a, b, c (3 characters)
                left++;
            }

            charSet.add(s.charAt(right));

            result = Math.max(result, right - left + 1);
        }

        return result;
    }


    //Don't go with below solution, it actually doesn't follow sliding window protocol - Test eg. abc12x345cxyz (it may give right ans, but doesn't follow principle)
//    public static int lengthOfLongestSubstring(String s) {
//        int i = 0;
//        int j = 0;
//        int max = 0;
//
//        Set<Character> set = new HashSet<>();
//
//        while (j < s.length()) {
//            if (!set.contains(s.charAt(j))) {
//                set.add(s.charAt(j));
//                j++;
//                max = Math.max(set.size(), max);
//            } else {
//                set.remove(s.charAt(i));
//                i++;
//            }
//        }
//
//        return max;
//    }
}
