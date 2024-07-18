package org.example.e33;

import java.util.Scanner;

public class E33NestedIfAndScanner {
    public static void main(String[] args) {
<<<<<<< HEAD
        // Create a Scanner object to read input
=======
Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=scan.nextInt();
        if(num%2==0){
            System.out.println("Value is even");
        }if(num>1000){
            System.out.println("even number is large");

            }if(num%2==0 && num<1000){
        System.out.println("Even value is just right");}
        else if(num % 2 != 0){
           System.out.println("Value is odd");
        }
        if(num>1000) {
            System.out.println("Odd value is large");
        }else if(num<1000 && num%2!=0) {
            System.out.println("odd value is just right");
        }
        }}




>>>>>>> 13e2030b106a9a10f908b925c32a3cde0facc799

        // Print prompt for user to enter a number
        // Capture the number input

<<<<<<< HEAD
        // Classify the number
        // Use an if-else statement to check if the number is even or odd
        // If the number is even
        //    Print "Value is even"
        //    Use another if-else statement to check if the number is greater than 1000
        //        If it is, print "Even value is large"
        //        Otherwise, print "Even value is just right"
        // If the number is odd
        //    Print "Value is odd"
        //    Use another if-else statement to check if the number is greater than 1000
        //        If it is, print "Odd value is large"
        //        Otherwise, print "Odd value is just right"
    }
}
=======
>>>>>>> 13e2030b106a9a10f908b925c32a3cde0facc799
