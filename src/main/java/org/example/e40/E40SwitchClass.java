package org.example.e40;

import java.util.Scanner;

public class E40SwitchClass {
    public static void main(String[] args) {
<<<<<<< HEAD
        // Create a Scanner object to read input
=======
        Scanner scan=new Scanner(System.in);
        String instructorName=scan.nextLine();
        // System.out.println("Enter name of the instructor");
        switch (instructorName){
            case "Asghar":
                System.out.println("Will take care of Java Assignment");
                break;
            case "Moazzam":
                System.out.println("Will take care of SDLC Assignment");
                break;
            case "Weqas":
                System.out.println("Will take care of Selenium Assignment");
                break;
            case "Asel":
                System.out.println("Will take care of every Assignment");
                break;
            default:
                System.out.println(" Invalid instructor selected");
        }
>>>>>>> 13e2030b106a9a10f908b925c32a3cde0facc799

        // Print prompt for user to enter the name of the instructor
        // Capture the instructor name input

        // Determine the responsibility based on the instructor's name using a switch statement
        // If the name is "Asghar"
        //    Set responsibility to "Will take care of Java Assignment"
        // If the name is "Moazzam"
        //    Set responsibility to "Will take care of SDLC Assignment"
        // If the name is "Weqas"
        //    Set responsibility to "Will take care of Selenium Assignment"
        // If the name is "Asel"
        //    Set responsibility to "Will take care of every Assignment"
        // For any other name
        //    Set responsibility to "Invalid instructor selected"

        // Print the responsibility
    }
}
