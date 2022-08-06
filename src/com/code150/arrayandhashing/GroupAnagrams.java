package com.code150.arrayandhashing;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs.length == 0) return res;

        Map<String, List<String>> map = new HashMap<>();

        char[] sortedCharArr;
        String sortedString;

        for (String str : strs) {
            sortedCharArr = str.toCharArray();
            Arrays.sort(sortedCharArr);
            sortedString = String.valueOf(sortedCharArr);

            if (map.containsKey(sortedString)) {
                map.get(sortedString).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sortedString, list);
            }
        }

        res.addAll(map.values());
        return res;
    }

//    public static List<List<String>> groupAnagrams(String[] strs) {
//        List<List<String>> res = new ArrayList<>();
//        if (strs.length == 0) return res;
//        HashMap<String, List<String>> map = new HashMap<>();
//        for (String s : strs) {
//            char[] hash = new char[26];
//            for (char c : s.toCharArray()) {
//                hash[c - 'a']++;
//            }
//            String key = new String(hash);
//            map.computeIfAbsent(key, k -> new ArrayList<>());
//            map.get(key).add(s);
//        }
//        res.addAll(map.values());
//        return res;
//    }
}
