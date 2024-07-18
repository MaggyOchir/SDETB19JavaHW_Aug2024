package org.example.e37;

import java.util.Scanner;

public class E37LogicalOperators {
    public static void main(String[] args) {
<<<<<<< HEAD
        // Create a Scanner object to read input
=======
        Scanner scan=new Scanner(System.in);
        boolean thirsty=scan.nextBoolean();
        boolean sleepy=scan.nextBoolean();

        if(thirsty & !sleepy){
            System.out.println("Looks like you need to drink water");

          } else if (thirsty && sleepy) {
            System.out.println("Looks like you need to drink coffee");

          } else if (! thirsty && ! sleepy) {
            System.out.println("Looks like you need to drink nothing");

        }else {
            System.out.println("Looks like you need to drink tea");
        }
>>>>>>> 13e2030b106a9a10f908b925c32a3cde0facc799

        // Print prompt for user to answer if they are thirsty
        // Capture the thirsty input

        // Print prompt for user to answer if they are sleepy
        // Capture the sleepy input

        // Determine the drink based on the inputs
        // If user is thirsty and not sleepy
        //    Set drink to "water"
        // If user is thirsty and sleepy
        //    Set drink to "coffee"
        // If user is not thirsty and sleepy
        //    Set drink to "tea"
        // Otherwise
        //    Set drink to "nothing"

        // Print the drink suggestion
        // Output: Looks like you need to drink ___
    }
}
