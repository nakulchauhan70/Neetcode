package com.code150.arrayandhashing;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    //a = 1, n = -1
    //n = 0, a = 0
    //a = 1, g = -1,
    //g = 0, a = 0,
    //r = 1, r = 0,
    //a = 1, a = 0,
    //m = 1, m = 0

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int count[] = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;
        }

//        int[] store = new int[26];
//
//        for(int i=0; i<s.length(); i++){
//            store[s.charAt(i) - 'a']++;
//            store[t.charAt(i) - 'a']--;
//        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
