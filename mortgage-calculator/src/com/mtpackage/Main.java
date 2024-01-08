package com.mtpackage;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_PER_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float annualInterest = 0;
        int years = 0;
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Principal (Loan) amount ($1K - $1M): ");
            principal = scanner.nextInt();
            if((principal <= 1_000_000) && (principal >= 1000))
                break;
            System.out.println("Enter a value within $1K - $1M");
        }

        while (true) {
            System.out.print("Annual interest rate (%) : ");
            annualInterest = scanner.nextFloat();
            if (annualInterest > 0)
                break;
            System.out.println("Enter a interest rate greater than 0");
        }

        float monthlyInterest = annualInterest/(PERCENT*MONTHS_PER_YEAR);

        while (true) {
            System.out.print("Years to pay (1 - 30): ");
            years = scanner.nextInt();
            if (years >= 1 && years <= 30)
                break;
            System.out.println("Enter value within 1 to 30");
        }

        int paymentMonths = years*MONTHS_PER_YEAR;

        double numerator = monthlyInterest * Math.pow((1+monthlyInterest), paymentMonths);
        double denominator = ( (Math.pow((1+monthlyInterest) ,paymentMonths)) - 1);
        double mortgage = principal*(numerator/denominator);

        String mortgageCurrency = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Your monthly payment : " + mortgageCurrency);

    }
}
