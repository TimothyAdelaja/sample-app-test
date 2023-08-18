package com.interswitch.test;

public class CaseTest {
    public static void main(String[] args) {
        UpperLowerCase ulcase = new UpperLowerCase();
        System.out.printf("%s to %s", "Hello World", ulcase.wordToUpperCase("Hello World"));
        System.out.println();
        System.out.printf("%s to %s\n","Hello World", ulcase.wordToLowerCase("Hello World"));
    }
}
