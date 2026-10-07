package com.nabanita.hackerrank.strings;
/*
 * HackerRank: Java String Introduction
 *
 * Problem:
 * Given two strings of lowercase English letters, perform three operations:
 *
 * 1. Calculate and print the sum of their lengths.
 * 2. Determine whether String A is lexicographically greater than String B.
 *    - Print "Yes" if A comes after B alphabetically.
 *    - Otherwise, print "No".
 * 3. Capitalize the first letter of both strings and print them
 *    on the same line, separated by a space.
 *
 * Input:
 * - Two lowercase English strings, A and B.
 *
 * Output:
 * - Sum of the lengths of A and B.
 * - "Yes" or "No" based on lexicographical comparison.
 * - A and B with their first letters capitalized, separated by a space.
 *
 * Concepts:
 * - String.length()
 * - String.compareTo()
 * - String.substring()
 * - String.toUpperCase()
 * - Lexicographical comparison
 */
import java.io.*;
import java.util.*;

public class StringProbs {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String A= sc.next();
        String B = sc.next();
        System.out.println(A.length()+B.length());

        if(A.compareTo(B)<0)
        {
            System.out.println("Yes");

        }
        else
        {
            System.out.println("No");
        }
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1,A.length())+" "+B.substring(0,1).toUpperCase()+B.substring(1,B.length()));
    }

}