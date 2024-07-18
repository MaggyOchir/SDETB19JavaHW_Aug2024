package org.example.e35;

import java.util.Scanner;

public class E35LogicalOperators {
    public static void main(String[] args) {
<<<<<<< HEAD
        // Create a Scanner object to read input
=======
Scanner scan=new Scanner(System.in);

        boolean loan=scan.nextBoolean();

        if(loan){
           // System.out.println("Do you need a loan?");

           // System.out.println( "What is your credit score?");
            int creditScore=scan.nextInt();

               if(creditScore<600){
                System.out.println("The eligibility is Not eligible");

            } else if (creditScore>=600 && creditScore<=700) {
                System.out.println("The eligibility is Maybe eligible");

            }else if (creditScore>700 && creditScore<800){
                System.out.println("The eligibility is Eligible");
            }else {
                System.out.println("The eligibility is Definitely eligible");

            }


        }else  {
            System.out.println("The eligibility is Unknown");
        }





>>>>>>> 13e2030b106a9a10f908b925c32a3cde0facc799

        // Print prompt for user to answer if they need a loan
        // Capture the loan requirement input

        // Check if the user needs a loan
        // If the user needs a loan
        //    Print prompt for user to enter their credit score
        //    Capture the credit score input
        //    Determine eligibility based on credit score
        //        If credit score is below 600, eligibility = "Not eligible"
        //        If credit score is between 600 and 700 inclusive, eligibility = "Maybe eligible"
        //        If credit score is between 701 and 800 inclusive, eligibility = "Eligible"
        //        If credit score is higher than 800, eligibility = "Definitely eligible"
        // If the user does not need a loan, eligibility = "Unknown"

        // Print the eligibility status
    }
}
