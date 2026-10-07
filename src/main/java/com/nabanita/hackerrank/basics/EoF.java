package com.nabanita.hackerrank.basics;
/*
 * HackerRank: Java End-of-file
 *
 * Problem:
 * Read an unknown number of lines from standard input until EOF,
 * then print each line with its line number.
 *
 * Input:
 * - An unknown number of non-empty String lines.
 * - Continue reading until EOF.
 *
 * Output:
 * - Print each line in the format:
 *   lineNumber + " " + lineContent
 *
 * Example:
 * Input:
 * Hello world
 * I am a file
 * Read me until end-of-file.
 *
 * Output:
 * 1 Hello world
 * 2 I am a file
 * 3 Read me until end-of-file.
 *
 * Concepts:
 * - Scanner
 * - hasNext()
 * - nextLine()
 * - while loop
 * - EOF (End Of File)
 */

import java.io.*;
import java.util.*;

public class EoF{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int lineNumber = 1;

        while (sc.hasNextLine()){

            String line = sc.nextLine();

            System.out.println(lineNumber + " " + line);

            lineNumber++;
        }

        sc.close();
    }
}
