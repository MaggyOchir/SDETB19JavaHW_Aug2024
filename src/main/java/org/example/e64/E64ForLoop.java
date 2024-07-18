package org.example.e64;

import java.util.Scanner;

public class E64ForLoop {
    public static void main(String[] args) {
<<<<<<< HEAD
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a value for end
        System.out.print("Int: ");
        int end = scanner.nextInt();
=======
        Scanner scan= new Scanner(System.in);
        System.out.print("Int:");
        int num= scan.nextInt();

        //write your code below
        for (int i = 0; i < num * 2; i++) {
            System.out.print(i + " ");
        }
>>>>>>> 13e2030b106a9a10f908b925c32a3cde0facc799

        // Use a for loop that starts with i = 0 and continues while i < 2 * end
        // Inside the loop, print the value of i followed by a space
    }
}
