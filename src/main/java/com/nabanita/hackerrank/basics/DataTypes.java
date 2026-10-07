package com.nabanita.hackerrank.basics;

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
