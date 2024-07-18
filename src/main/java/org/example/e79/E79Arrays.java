package org.example.e79;

public class E79Arrays {
<<<<<<< HEAD
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {1, 1, 2}, //sum = 4
                {3, 1, 2}, //sum = 6
                {3, 5, 3}, //sum = 11
                {0, 1, 2}  //sum = 3
        };
=======
    public static void main(String[][] args) {
        //please write the code from here

        int[][] num={{1,1,2},{3,1,2},{3,5,3},{0,1,2}};
        int sum=0;
        for (int i=0;i<num.length;i++){
            for (int j=0;j<3;j++){
                sum=sum+num[j];

            }
        }


                  }
    }
>>>>>>> 13e2030b106a9a10f908b925c32a3cde0facc799

        // Declare an array to store the sums of each row

        // Use nested loops to iterate through the 2D array and calculate the sum of each row

        // Store the sums in the new array

        // Print the values of the new array
    }
}
