package com.nabanita.hackerrank.basics;
/*
 * HackerRank: Java Stdin and Stdout II
 *
 * Problem:
 * Read an integer, a double, and a String from stdin,
 * then print them in the specified format.
 *
 * Input:
 * - First line: integer
 * - Second line: double
 * - Third line: String
 *
 * Output:
 * String: <String>
 * Double: <double>
 * Int: <integer>
 *
 * Concepts:
 * - Scanner
 * - nextInt()
 * - nextDouble()
 * - nextLine()
 *
 * Note:
 * After nextInt() or nextDouble(), the newline remains in the
 * input buffer. Use nextLine() to consume it before reading the String.
 */
import java.io.*;
import java.util.*;

public class InpOp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double d = sc.nextDouble(); sc.nextLine();
        String s = sc.nextLine();
        sc.close();
        System.out.println("String:"+" "+ s);
        System.out.println("Double:"+"\t"+ d);
        System.out.println("Int:"+" "+ n);
    }
}
