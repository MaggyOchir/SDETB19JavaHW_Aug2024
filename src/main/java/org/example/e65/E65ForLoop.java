package org.example.e65;

import java.util.Scanner;

public class E65ForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);
        int x=input.nextInt();

      //  System.out.println("int"+" "+x);
        for (int i=x-1; i>=0;i--){
            System.out.print(i+" ");
        }

        // Prompt the user to enter a value for x
        System.out.print("In: ");
        int x = input.nextInt();

        // Use a for loop that starts with i = x - 1 and continues while i >= 0
        // Inside the loop, print the value of i followed by a space
    }
}
