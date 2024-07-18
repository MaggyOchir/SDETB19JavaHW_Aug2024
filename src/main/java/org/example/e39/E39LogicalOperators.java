package org.example.e39;

import java.util.Scanner;

public class E39LogicalOperators {
    public static void main(String[] args) {
<<<<<<< HEAD
        // Create a Scanner object to read input
=======
        Scanner scan=new Scanner(System.in);
        //System.out.println("Please enter your mark");
        double mark=scan.nextDouble();
        if(mark>=1 && mark<25){
            System.out.println("Your grade is F");

          } else if (mark>=25 && mark<45) {
            System.out.println("Your grade is E");

          } else if (mark>=45 && mark<50) {
            System.out.println("Your grade is D");

          } else if (mark>=50 && mark<60) {
            System.out.println("Your grade is C");

          } else if (mark>=60 && mark<=80) {
            System.out.println("Your grade is B");

          } else if (mark>80 ) {
            System.out.println("Your grade is A");

        }else {
            System.out.println("Please enter valid mark");
        }
>>>>>>> 13e2030b106a9a10f908b925c32a3cde0facc799

        // Print prompt for user to enter their mark
        // Capture the mark input

        // Determine the grade based on the mark
        // If marks are between 1 and 25 (inclusive)
        //    Set grade to "F"
        // If marks are between 26 and 45 (inclusive)
        //    Set grade to "E"
        // If marks are between 46 and 50 (inclusive)
        //    Set grade to "D"
        // If marks are between 51 and 60 (inclusive)
        //    Set grade to "C"
        // If marks are between 61 and 80 (inclusive)
        //    Set grade to "B"
        // If marks are above 80
        //    Set grade to "A"
        // If marks are not within the valid range (0-100)
        //    Print "Please enter valid mark"

        // Print the grade
        // Output: Your grade is ____
    }
}
