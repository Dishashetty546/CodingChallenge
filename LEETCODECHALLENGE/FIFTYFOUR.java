package LEETCODECHALLENGE;

// Longest palindrome substring

// ex: ABRBADAADAB
// there are multiple palindrome here - DAAD, BRB, BADAADAB, ABRBA
// Longest of all is - ADAADAB - O/P

// Brute force approach
// time complexity: o(n^3)
// public class FIFTYFOUR {
// public static void main(String[] args) {
// String input = "ABRBADAADAB";
// System.out.println(substrings(input));

// }

// public static String substrings(String s) {

// int n = s.length();
// String longest = "";
// for (int i = 0; i < n; i++) {
// for (int j = i; j < n; j++) {
// String subString = s.substring(i, j + 1);
// if (isPalindrome(subString) && subString.length() > longest.length()) {
// longest = subString;
// }
// }
// }
// return longest;

// }

// public static boolean isPalindrome(String s) {
// int start = 0;
// int end = s.length() - 1;
// while (start < end) {
// if (s.charAt(start) != s.charAt(end)) {
// return false;
// }
// start++;
// end--;

// }
// return true;
// }

// }
