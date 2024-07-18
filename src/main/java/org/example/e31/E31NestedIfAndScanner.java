package org.example.e31;

import java.util.Scanner;

public class E31NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input

<<<<<<< HEAD
        // Declare a boolean variable isSunny
        // Print "Is it sunny outside? (true/false)"
        // Capture the user's input and store it in isSunny
=======
        Scanner scan=new Scanner(System.in);
        System.out.println("Is it sunny outside?");
        boolean isSunny=scan.nextBoolean();
        if(isSunny){
            System.out.println("It is a sunny day, I should go somewhere!");
            System.out.println("What is the temperature outside?");
            int temp=scan.nextInt();
            if(temp>85){
                System.out.println( "I am going to the beach");
            }else {
                System.out.println("I am going to the park");
            }



        }else {
            System.out.println("I stay home and practice Java");}





>>>>>>> 13e2030b106a9a10f908b925c32a3cde0facc799

        // Declare an integer variable temperature

        // Use an if-else statement to check if it is sunny
        // If it is sunny
        //    Print "It is a sunny day, I should go somewhere!"
        //    Print "What is the temperature outside?"
        //    Capture the user's input and store it in temperature
        //    Use another if-else statement to check the temperature
        //        If the temperature is higher than 85
        //            Print "I am going to the beach!"
        //        Otherwise
        //            Print "I am going to the park!"
        // If it is not sunny
        //    Print "I stay home and practice Java"
    }
}
