package org.example.e30;

import java.util.Scanner;

public class E30ScannerClass {
    public static void main(String[] args) {
<<<<<<< HEAD
        // Create a Scanner object to read input

        // Print prompt for user to input the month number

        // Capture the month number

        // Check the value of monthNumber and identify the month
        // If the value is between 1 and 12, print the corresponding month name
        // If the value is out of range, print "Invalid"
=======
        Scanner month = new Scanner(System.in);
        //DO NOT CHANGE ABOVE CODE!  Write your code below
        System.out.println("Please enter month number");
        int monthNumber=month.nextInt();
        switch (monthNumber){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("Sept");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid");
        }
>>>>>>> 13e2030b106a9a10f908b925c32a3cde0facc799
    }
}
