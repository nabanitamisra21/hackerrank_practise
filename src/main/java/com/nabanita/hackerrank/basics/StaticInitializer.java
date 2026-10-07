package com.nabanita.hackerrank.basics;
/*
 * HackerRank: Java Static Initializer Block
 *
 * Problem:
 * Given the breadth and height of a parallelogram, calculate its area.
 *
 * Input:
 * - Two integers:
 *   - Breadth
 *   - Height
 *
 * Task:
 * - Use a static initialization block to validate the values.
 * - If both breadth and height are positive, calculate:
 *   Area = Breadth × Height
 * - If either value is zero or negative, print:
 *   java.lang.Exception: Breadth and height must be positive
 *
 * Concepts:
 * - Static initialization blocks
 * - static variables
 * - Input using Scanner
 * - Conditional statements
 * - Exception handling / validation
 */
import java.util.*;
public class StaticInitializer
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int B=sc.nextInt();
        int H=sc.nextInt();
        if (B<0 || H<0)
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else {
            System.out.println(B*H);
        }
        sc.close();
}
}
