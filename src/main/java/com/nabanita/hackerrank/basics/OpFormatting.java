package com.nabanita.hackerrank.basics;
/*
 * HackerRank: Java Output Formatting
 *
 * Problem:
 * Read a String and an integer from each input line and print them
 * in a specific formatted layout using System.out.printf().
 *
 * Input:
 * - 3 lines, each containing a String followed by an integer.
 * - String has a maximum of 10 alphabetic characters.
 * - Integer is in the range 0 to 999.
 *
 * Output:
 * - Print a separator line of 32 '=' characters.
 * - String must be left-justified in a 15-character column.
 * - Integer must occupy exactly 3 digits, padding with leading zeros.
 * - Print another separator line of 32 '=' characters.
 *
 * Concepts:
 * - System.out.printf()
 * - Format specifiers
 * - Left justification (%-15s)
 * - Zero-padding (%03d)
 */
import java.io.*;
import java.util.*;
public class OpFormatting
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============================");
        for (int i = 0; i < 3; i++)
        {
            String word = sc.next();
            int num = sc.nextInt();
            if (word.length() <= 10  && num <= 999)
            {
                    System.out.printf("%-15s%03d%n", word, num);
                }
                else
                {
                    System.out.println("invalid input");
                }
            }
        System.out.println("==============================");
    }
}



