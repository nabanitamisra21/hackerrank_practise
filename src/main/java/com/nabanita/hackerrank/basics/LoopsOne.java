package com.nabanita.hackerrank.basics;


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
