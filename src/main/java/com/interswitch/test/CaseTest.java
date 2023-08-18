package com.interswitch.test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CaseTest {
    public static void main(String[] args) {
        UpperLowerCase ulcase = new UpperLowerCase();
        System.out.printf("%s to %s", "Hello World", ulcase.wordToUpperCase("Hello World"));
        System.out.println();
        System.out.printf("%s to %s\n","Hello World", ulcase.wordToLowerCase("Hello World"));

        System.out.println("New Go-home feature by Backbone Team  at " + LocalDateTime.now());
    }
}
