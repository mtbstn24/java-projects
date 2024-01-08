package com.mtpackage;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        primitive data types
        int age = 25;
        byte myAge = 30;
        long viewsCount = 3_123_456_789L;
//        underscore can be used to separate 3 by 3 digits
	    double smallPrice = 10.9;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = true;

//        reference data types, should allocate memory using new
        Date now = new Date();
        System.out.println(now);
        String letters = "long string"; //reference type

//        primitive data type variables have seperate memory locations
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);

//        reference type values store the mem address of the new object
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

//        strings are immutable, so returns a new string if changed using a method
        String message = "Hello World" + "!!";
        System.out.println(message.endsWith("!!"));
        System.out.println(message.replace("!","*"));

//        escape characters using \
        System.out.println("String \"length\"");

//        arrays are of fixed length
        int[] intArray = new int[5];
        intArray[0] = 35;
        intArray[1] = 9;
        System.out.println(intArray); //prints the address space and not the contents
        System.out.println(Arrays.toString(intArray)); //prints string representation
        int[] numbers = {35, 21, 3, 4, 5};
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); //prints string representation

        int[][] twoDArray = new int[2][3];
        twoDArray[0][0] = 60;
        System.out.println(Arrays.toString(twoDArray));
        System.out.println(Arrays.deepToString(twoDArray));

        int[][] sameArray = {{1,2,3},{45,3,8}};
        System.out.println(Arrays.deepToString(sameArray));

//        static variable using constants
        final float PI = 3.14F;

//        arithmetic operations
        double result = (double)10/(double)5; //explicit casting
        int num1 = 1;
        num1 += 2; //augmented or compound assignment operator
        num1 /= 3;

//        implicit casting
//        byte > short > int > long
        short num2 = 1;
        int num3 = num1 + 2;

//        wrapper class
        String numStr = "15";
        System.out.println(Integer.parseInt(numStr));

//        Math class to get rounded random num between 0 to 100
        double res = Math.round(Math.random() * 100);
        System.out.println(res);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String res1 = currency.format(123456.789);
        System.out.println(res1);

//        method chaining, chaining multiple methods together
        String per = NumberFormat.getPercentInstance().format(0.74);
        System.out.println(per);

//        user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your age: ");
        byte age1 = scanner.nextByte();
        System.out.println("You are " + age1);
        scanner.nextLine(); //to read the new line entered previously
        System.out.print("Your name: ");
        String name = scanner.nextLine(); //next reads a single token, nextline reads whole line
        System.out.println("You are " + name);

//        comparison operators
        int x1 = 1;
        int x2 = 2;
        System.out.println(x != y); //==, >, >=, <=

//        logical operators
        int temp = 12;
        boolean isWarm = temp > 20 && temp < 30;
        System.out.println(isWarm);
//        OR - ||, NOT - !,
//        starts from left side to evaluate

//        if statements
        if (temp > 30) {
            System.out.println("Hot day");
            System.out.println("Drink more water");
        }
        else if (temp > 20)
            System.out.println("Beautiful day");
        else {
            System.out.println("Cold day");
        }

//        ternary operator
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(income + " " + className);

//        switch statements
        String role = "admin";
        switch (role){
            case "admin":
                System.out.println("You're admin");
                break;

            case "moderator":
                System.out.println("You're moderator");
                break;

            default:
                System.out.println("You're guest");
        }

    }
}
