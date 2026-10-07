package com.nabanita.hackerrank.strings;
/*
 * HackerRank: Java Substring
 *
 * Problem:
 * Given a String s and two integers, start and end, print the
 * substring containing characters from index start to index end - 1.
 *
 * Input:
 * - First line: String s.
 * - Second line: two space-separated integers start and end.
 *
 * Output:
 * - Print the substring from index start (inclusive) to end (exclusive).
 *
 * Example:
 * Input:
 * Helloworld
 * 3 7
 *
 * Output:
 * lowo
 *
 * Concepts:
 * - String indexing
 * - substring(start, end)
 * - Scanner
 * - Zero-based indexing
 *
 * Note:
 * String.substring(start, end) includes the character at start
 * but excludes the character at end.
 */

import java.util.*;
import java.io.*;
public class SubStringss
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String S= sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(S.substring(start,end));
        sc.close();
    }
}

