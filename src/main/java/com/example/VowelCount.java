package com.example;

public class VowelCount {

    public static int countVowels(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String cannot be null");
        }

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println("Number of vowels: " + countVowels(str));
    }
}