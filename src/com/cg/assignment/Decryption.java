package com.cg.assignment;

import java.util.Scanner;

public class Decryption {
    public static String decryptString(String s) {
        // Reverse the string
        s = new StringBuilder(s).reverse().toString();
        
        StringBuilder result = new StringBuilder();
        
        // Iterate through the reversed string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                // If the character is a digit, repeat the next character (digit times)
                int count = Character.getNumericValue(c);
                char nextChar = s.charAt(i + 1);
                for (int j = 0; j < count; j++) {
                    result.append(nextChar);
                }
                i++; // Skip the next character
            } else {
                // If the character is not a digit, add it to the result
                result.append(c);
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the encrypted string:");
        String encryptedString = scanner.nextLine();
        
        String decryptedString = decryptString(encryptedString);
        System.out.println("Decrypted string: " + decryptedString);
    }
}
