package com.nabanita.hackerrank.strings;



import java.util.*;
public class PalinDrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();
        if(A.length()< 50)
        {
            for (int i = 0; i < A.length() / 2; i++) {
                if (A.charAt(i) != A.charAt(A.length() - i - 1)) {
                    System.out.println("No");
                    return;
                }
            }

            System.out.println("Yes");
        }
    }
}
