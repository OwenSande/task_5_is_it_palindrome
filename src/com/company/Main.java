package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input, result;

        System.out.println("Enter a word to check if it is palindrome ");
        Scanner sc = new Scanner(System.in);
        input = sc.next();

        //Convert to lowerCase
        result = input.toLowerCase(Locale.ROOT);
        System.out.println(result);
        System.out.println("Is the word palindrome? ");

        String test = result;
        char[] array = test.toCharArray();
        System.out.println(istPalindrome(array));
    }
    
    public static boolean istPalindrome(char[] test) {
        boolean palindrome = false;
        if (test.length % 2 == 0) {
            for (int i = 0; i < test.length / 2 - 1; i++) {
                if (test[i] != test[test.length - i - 1]) {
                    return false;
                } else {
                    palindrome = true;
                }
            }
        } else {
            for (int i = 0; i < (test.length - 1) / 2 - 1; i++) {
                if (test[i] != test[test.length - i - 1]) {
                    return false;
                } else {
                    palindrome = true;
                }
            }
        }
        return palindrome;
    }
}
