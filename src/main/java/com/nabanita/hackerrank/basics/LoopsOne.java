package com.nabanita.hackerrank.basics;
/*
 * HackerRank: Java Loops II
 *
 * Problem:
 * Given an integer N, print its first 10 multiples.
 *
 * Input:
 * - One integer N.
 *
 * Output:
 * - Print 10 lines, one for each multiplier from 1 to 10.
 * - Format: N x i = result
 *
 * Example:
 * N = 2
 * 2 x 1 = 2
 * 2 x 2 = 4
 * ...
 * 2 x 10 = 20
 *
 * Concepts:
 * - for loop
 * - Multiplication operator (*)
 * - Variables
 * - String concatenation (+)
 */

import java.util.*;
import java.io.*;
public class LoopsOne
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int result=0;
        sc.close();
        for (int i=1; i<=10; i++)
        {
            result = n*i;
            System.out.println(n+"\t"+"*"+"\t"+i+"\t"+"="+"\t"+result);
        }
    }
}
