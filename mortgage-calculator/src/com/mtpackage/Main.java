package com.mtpackage;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_PER_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal (Loan) amount : ");
        int principal = scanner.nextInt();
        System.out.print("Annual interest rate (%) : ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest/(PERCENT*MONTHS_PER_YEAR);
        System.out.print("Years to pay : ");
        int years = scanner.nextInt();
        int paymentMonths = years*MONTHS_PER_YEAR;

        double numerator = monthlyInterest * Math.pow((1+monthlyInterest), paymentMonths);
        double denominator = ( (Math.pow((1+monthlyInterest) ,paymentMonths)) - 1);
        double mortgage = principal*(numerator/denominator);

        String mortgageCurrency = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Your monthly payment : " + mortgageCurrency);

    }
}
