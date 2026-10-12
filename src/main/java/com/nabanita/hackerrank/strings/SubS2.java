package com.nabanita.hackerrank.strings;
/*
 * HackerRank: Java Substring Comparisons
 *
 * Problem:
 * Given a String s and an integer k, find the lexicographically
 * smallest and largest substrings of length k.
 *
 * Input:
 * - First line: String s.
 * - Second line: Integer k, the required substring length.
 *
 * Task:
 * - Generate every possible substring of length k.
 * - Compare the substrings lexicographically.
 * - Find the smallest and largest substring.
 *
 * Output:
 * - Print the smallest substring on the first line.
 * - Print the largest substring on the second line.
 *
 * Concepts:
 * - String.substring()
 * - String.length()
 * - Lexicographical comparison
 * - compareTo()
 * - for loop
 *
 * Important:
 * - Substrings must be contiguous.
 * - Each substring must have exactly k characters.
 * - substring(i, i + k) includes index i but excludes i + k.
 */


import java.util.*;
public class SubS2 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 0; i <= s.length() - k; i++) {
            String current = s.substring(i, i + k);

            if (current.compareTo(smallest) < 0) {
                smallest = current;
            }

            if (current.compareTo(largest) > 0) {
                largest = current;
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}