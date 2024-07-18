package org.example.e63;

import java.util.Scanner;

public class E63ForLoop {
    public static void main(String[] args) {
<<<<<<< HEAD
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
=======
        Scanner scan=new Scanner(System.in);
        System.out.print("In:");
        int number=scan.nextInt();
        for (int i=0; i<number;i++){
            System.out.print(i+" ");
        }
>>>>>>> 13e2030b106a9a10f908b925c32a3cde0facc799

        // Prompt the user to enter a value for x
        System.out.print("In: ");
        int x = scanner.nextInt();

        // Use a for loop that starts with i = 0 and continues while i < x
        // Inside the loop, print the value of i followed by a space
    }
}
