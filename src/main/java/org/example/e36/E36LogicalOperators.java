package org.example.e36;

import java.util.Scanner;

public class E36LogicalOperators {
    public static void main(String[] args) {
<<<<<<< HEAD
        // Create a Scanner object to read input
=======
        Scanner scan=new Scanner(System.in);
       // System.out.println("Please enter two strings");
        String word1=scan.nextLine();
        String word2=scan.nextLine();
       // System.out.println("Please enter two numbers");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        if(num1==num2 && word1.equals(word2)) {
            System.out.println("AND");
        }else if (num1==num2 || word1==word2 ) {
                System.out.println("OR");

            } else if (num1!=num2 && !word1.equals(word2)) {
                System.out.println("NONE");
            }
        }
>>>>>>> 13e2030b106a9a10f908b925c32a3cde0facc799

        // Print prompt for user to enter their monthly rent expense
        // Capture the rent expense input

        // Print prompt for user to enter their monthly food expense
        // Capture the food expense input

        // Print prompt for user to enter their monthly transportation expense
        // Capture the transportation expense input

        // Print prompt for user to enter their monthly entertainment expense
        // Capture the entertainment expense input

        // Analyze expenses
        // If rentExpense is greater than foodExpense and transportationExpense is greater than entertainmentExpense
        //    Print "You are prioritizing essentials well."
        // Else if rentExpense is greater than foodExpense or transportationExpense is greater than entertainmentExpense
        //    Print "You are on the right track, but could improve."
        // Else
        //    Print "You need to rethink your spending priorities."
    }

