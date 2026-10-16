package com.pluralsight;

import java.util.Scanner;

public class SandwichApp {
    public static void main(String[] args) {

        // prompt user for regular or large size sandwich and store answer
        System.out.println("Enter 1 for a Regular sandwich or 2 for a Large sandwich. ");
        Scanner myscanner = new Scanner(System.in);
        int inputSize = myscanner.nextInt();

        // ask if user would like a loaded option for an additional cost. store answer
        System.out.println("Would you like the 'loaded' option?");
        String loadedOption = myscanner.next();

        // define variables for diff prices
        double regPrice = 5.45, largePrice = 8.95;
        double userPrice = 0;

        // if statement to determine cost for user's sandwich
        // nested if statement to determine cost after loaded option
        if (inputSize == 1) {
            userPrice = regPrice;
            if (loadedOption.equalsIgnoreCase("yes")) {
                userPrice += 1.00;
            }
        }
        else if (inputSize == 2) {
            userPrice = largePrice;
            if (loadedOption.equalsIgnoreCase("yes")) {
                userPrice += 1.75;
            }
        }
        else {
            System.out.println("Not a valid input.");
            System.exit(0); // quit program if user enters
        }


        // prompt user for age and store answer
        System.out.println("Please enter your age. ");
        int age = myscanner.nextInt();

        // if statement to determine size of discount, if any
        if (age <= 17) {
            System.out.println("Apple a 10% discount.");
            userPrice = userPrice - (userPrice * .10); // 10% for 17 and under
        }
        else if (age >= 65) {
            System.out.println("Apple a 20% discount.");
            userPrice = userPrice - (userPrice * .20); // 20% off for 65 and older
        }
        else {
            System.out.println("No discount applicable. "); // no discount for anyone else
        }

        // print final cost for user's input
        System.out.printf("Price: %.2f for option %d", userPrice, inputSize);

    }
}
