package org.example.e77;

public class E77Arrays {
<<<<<<< HEAD
    public static void main(String[] args) {
        // Declare and initialize the array with the given values
        int[] numbers = {5, 4, 8};
=======
    public static void main(int[] args) {
        //write code from here
        int[] numbers={5,4,8};
        int max=numbers[0];
        for (int n:numbers){
            if (max<n){
                max=n;
            }
            System.out.print(max);
        }
>>>>>>> 13e2030b106a9a10f908b925c32a3cde0facc799

        // Use a loop to iterate through the array and find the highest value

        // Print the highest value found in the array
    }
}
