package org.example.e32;

import java.util.Scanner;

public class E32NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input

<<<<<<< HEAD
        // Print prompt for user to enter gender
        // Capture the gender input

        // Print prompt for user to enter age
        // Capture the age input

        // Classify based on gender and age
        // If age is above 25
        //    If gender is "F", print "Woman"
        //    Otherwise, print "Man"
        // If age is 25 or below
        //    If gender is "F", print "Girl"
        //    Otherwise, print "Boy"
    }
}
=======
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your gender: M or F");
        char gender=scan.next().charAt(0);

        System.out.println("Please enter your age");
        int age=scan.nextInt();

        if(gender=='M' && age>25){
            System.out.println("Man");

        } else if (gender=='M' && age<25 ) {
            System.out.println("boy");
        } else if (gender=='F' && age>25) {
            System.out.println("Women");
        }else{
            System.out.println("Girl");
        }

        }

    }



>>>>>>> 13e2030b106a9a10f908b925c32a3cde0facc799
