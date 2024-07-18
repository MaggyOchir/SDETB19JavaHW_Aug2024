package org.example.e43;

import java.util.Scanner;

public class E43SwitchStatment {
    public static void main(String[] args) {
<<<<<<< HEAD
        // Create a Scanner object to read input
=======
        Scanner scan=new Scanner(System.in);
       System.out.println("Input a number between 1-12");
        int num=scan.nextInt();
        switch (num){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("february");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("Abril");
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
                System.out.println("September");
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

        // Print prompt for user to enter their electricity usage in kWh
        // Capture the usage input

        // Calculate bill using switch statement
        // Case 0-100
        //    Multiply usage by $0.12 per kWh
        // Case 101-200
        //    Multiply usage by $0.15 per kWh
        // Case 201-300
        //    Multiply usage by $0.20 per kWh
        // Case 301 and above
        //    Multiply usage by $0.25 per kWh
        // Default
        //    Print "Invalid usage entered"

        // Print the bill
        // Output: Your electricity bill is $____
    }
}
