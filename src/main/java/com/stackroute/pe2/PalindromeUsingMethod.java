package com.stackroute.pe2;

import java.util.Scanner;

public class PalindromeUsingMethod {

    public static void checkPalindrome(String str) {
        // reverse the given String
        String reverse = new StringBuffer(str).reverse().toString();

        // check whether the string is palindrome or not
        if (str.equals(reverse)) {
            System.out.println("Entered String is a palindrome");
        }

        else {
            System.out.println("Entered String is not a palindrome");
        }
    }

    public static void main (String[] args) {

        String a;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string:");
        a = sc.next();

        checkPalindrome(a);
    }

}
