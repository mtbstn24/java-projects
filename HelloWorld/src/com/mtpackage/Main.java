package com.mtpackage;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

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

        //static variable using constants
        final float PI = 3.14F;
    }
}
