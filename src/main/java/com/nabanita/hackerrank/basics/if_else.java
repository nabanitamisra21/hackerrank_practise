package com.nabanita.hackerrank.basics;

/*
 * HackerRank: Java If-Else
 *
 * Problem:
 * Given a positive integer n, determine whether it is "Weird" or "Not Weird".
 *
 * Conditions:
 * - If n is odd → print "Weird"
 * - If n is even and between 2 and 5 → print "Not Weird"
 * - If n is even and between 6 and 20 → print "Weird"
 * - If n is even and greater than 20 → print "Not Weird"
 *
 * Input:
 * - One positive integer n.
 *
 * Output:
 * - Print "Weird" or "Not Weird" based on the conditions above.
 *
 * Concepts:
 * - if / else-if / else
 * - Modulus operator (%)
 * - Comparison operators
 */

import java.io.*;
import java.util.*;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n % 2 != 0) {
            System.out.println("Weird");
        }
        if (n % 2 == 0) {
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
        }
    }

