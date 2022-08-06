package com.code150.twopointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = " geeks for geeks has all java functions to read  ";
        System.out.println(s.trim());
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        s = s.trim().toLowerCase();

        int start = 0;
        int end = s.length() - 1;
        char startChar;
        char endChar;

        while (start <= end) {
            startChar = s.charAt(start);
            endChar = s.charAt(end);
            if (!isAlphaNumericAndNonWhiteSpace(startChar)) {
                start++;
            } else if (!isAlphaNumericAndNonWhiteSpace(endChar)) {
                end--;
            } else if (startChar == endChar) {
                start++;
                end--;
            } else {
                return false;
            }
        }

        return true;
    }

    private static boolean isAlphaNumericAndNonWhiteSpace(char ch) {
        //Upppercase ASCII - [65, 90]
        //Lowercase ASCII  - [97, 122]
        //Numbers          - [48 – 57]
        return (ch >= 97 && ch <= 122) || (ch >= 48 && ch <= 57);
    }


//    public boolean isPalindrome(String s) {
//        int i = 0;
//        int j = s.length() - 1;
//        while (i < j) {
//
//            Character start = s.charAt(i);
//            Character end = s.charAt(j);
//
//            if (!Character.isLetterOrDigit(start)) {
//                i++;
//                continue;
//            }
//
//            if (!Character.isLetterOrDigit(end)) {
//                j--;
//                continue;
//            }
//
//            if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
//                return false;
//            }
//
//            i++;
//            j--;
//        }
//
//        return true;
//    }
}
