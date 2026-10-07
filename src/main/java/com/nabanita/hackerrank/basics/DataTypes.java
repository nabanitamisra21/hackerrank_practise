package com.nabanita.hackerrank.basics;
/*
 * HackerRank: Java Datatypes
 *
 * Problem:
 * Given several integer values, determine which Java integer
 * primitive data types can store each value.
 *
 * Integer data types:
 * - byte  → 8-bit  signed integer
 * - short → 16-bit signed integer
 * - int   → 32-bit signed integer
 * - long  → 64-bit signed integer
 *
 * Input:
 * - First line: number of test cases T.
 * - Next T lines: one integer n per line.
 * - n can be very large or very small.
 *
 * Output:
 * - For each n, print the data types that can store it,
 *   ordered from smallest to largest:
 *
 *   n can be fitted in:
 *   * byte
 *   * short
 *   * int
 *   * long
 *
 * - If n cannot fit in any of the four types, print:
 *
 *   n can't be fitted anywhere.
 *
 * Concepts:
 * - Primitive data types
 * - Data type ranges
 * - long
 * - if / else
 * - for loop
 * - Exception handling (for very large input values)
 */
import java.util.*;
import java.math.*;

public class DataTypes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {

            BigInteger n = sc.nextBigInteger();

            boolean fitted = false;

            // byte
            if (n.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 &&
                    n.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {

                System.out.println(n + " can be fitted in:");
                System.out.println("* byte");
                fitted = true;
            }

            // short
            if (n.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 &&
                    n.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {

                if (!fitted) {
                    System.out.println(n + " can be fitted in:");
                }

                System.out.println("* short");
                fitted = true;
            }

            // int
            if (n.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 &&
                    n.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {

                if (!fitted) {
                    System.out.println(n + " can be fitted in:");
                }

                System.out.println("* int");
                fitted = true;
            }

            // long
            if (n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 &&
                    n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {

                if (!fitted) {
                    System.out.println(n + " can be fitted in:");
                }

                System.out.println("* long");
                fitted = true;
            }

            // Doesn't fit anywhere
            if (!fitted) {
                System.out.println(n + " can't be fitted anywhere.");
            }
        }

        sc.close();
    }
}
