package org.example.e72;

<<<<<<< HEAD
=======
import java.lang.reflect.Array;
>>>>>>> 13e2030b106a9a10f908b925c32a3cde0facc799
import java.util.Scanner;

public class E72Arrays {
    public static void main(String[] args) {
<<<<<<< HEAD
        // Create a Scanner object to read input from the console


        // Create an array of strings with size 7


        // Use a loop to prompt the user to input the days of the week one by one and store each input in the array

        // Use another loop to iterate through the array and print each value on a new line
=======
        Scanner scanner=new Scanner(System.in);
        String[] days=new String[7];
        days[0]="Sunday";
        days[1]="Monday";
        days[2]="Tuesday";
        days[3]="wednesday";
        days[4]="Thursday";
        days[5]="friday";
        days[6]="Saturday";
       for (int i=0;i<days.length;i++){
           System.out.println("Please enter day"+" "+(i+1)+" " + "of the week");
           String day=scanner.nextLine();

       }
       for (int i=0;i<days.length;i++){
           System.out.println(days[i]);
       }

>>>>>>> 13e2030b106a9a10f908b925c32a3cde0facc799

    }
}
