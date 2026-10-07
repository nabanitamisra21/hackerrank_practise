package com.nabanita.hackerrank.basics;
/*
 * HackerRank: Java Int to String
 *
 * Problem:
 * Given an integer n, convert it into a String.
 *
 * Input:
 * - One integer n.
 *
 * Task:
 * - Convert the integer n to a String.
 * - If the conversion is correct, the provided code prints "Good job".
 * - Otherwise, it prints "Wrong answer".
 *
 * Concepts:
 * - int to String conversion
 * - String.valueOf()
 * - Integer.toString()
 */
import java.util.*;
public class ConvString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

            String s = String.valueOf(n);
            if (s instanceof String)
                System.out.println("Good job");
            else
                System.out.println("Bad job");
            sc.close();
        }

}

