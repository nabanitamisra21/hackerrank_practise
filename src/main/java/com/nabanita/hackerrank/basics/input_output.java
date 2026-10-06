/*
 * HackerRank: Java Stdin and Stdout I
 *
 * Problem:
 * Read 3 integers from standard input and print
 * each integer on a separate line.
 *
 * Concepts:
 * - Scanner
 * - for loop
 * - nextInt()
 * - standard input/output
 */


package com.nabanita.hackerrank.basics;

import java.io.*;
import java.util.*;

public class input_output {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i<3; i++)
        {
            int myInt = sc.nextInt();
            System.out.println(myInt);
        }
        sc.close();
    }
}