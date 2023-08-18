package com.interswitch.test;

import com.interswitch.maven.Calculator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Calculator calculator = new Calculator();
        System.out.println("1 - Addition" + "\n" + "2 - Substraction" + "\n" + "3 - Division" + "\n" +
                "4 - Multiplication");
        Scanner myObj = new Scanner(System.in);
        Integer num = myObj.nextInt();
        if (num ==1){
            System.out.println("Enter two numbers");
            Scanner myObj1 = new Scanner(System.in);
            Scanner myObj2 = new Scanner(System.in);
            int num1 = myObj1.nextInt();
            int num2 = myObj2.nextInt();
            calculator.addition(num1,num2);
        } else if (num == 2) {
            System.out.println("Enter two numbers");
            Scanner myObj1 = new Scanner(System.in);
            Scanner myObj2 = new Scanner(System.in);
            int num1 = myObj1.nextInt();
            int num2 = myObj2.nextInt();
            calculator.substraction(num1,num2);
        } else if (num ==3) {
            System.out.println("Enter two numbers");
            Scanner myObj1 = new Scanner(System.in);
            Scanner myObj2 = new Scanner(System.in);
            int num1 = myObj1.nextInt();
            int num2 = myObj2.nextInt();
            calculator.division(num1,num2);
        } else if (num ==4) {
            System.out.println("Enter two numbers");
            Scanner myObj1 = new Scanner(System.in);
            Scanner myObj2 = new Scanner(System.in);
            int num1 = myObj1.nextInt();
            int num2 = myObj2.nextInt();
            calculator.multiply(num1,num2);
        }
        else{
            System.out.println("Enter a value between 1 and 4 ");
        }

        SalaryService salaryService= new SalaryService();
    }


}
