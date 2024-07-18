package org.example.e68;

public class E68Arrays {
    public static void main(String[] args) {
<<<<<<< HEAD
        // Create an array of characters and store the values 's', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'
        char[] letters = {'s', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'};

        // Print the characters at the indices that form the word "syntax"
        System.out.print(letters[0]);
        System.out.print(letters[4]);
        System.out.print(letters[2]);
        System.out.print(letters[6]);
        System.out.print(letters[9]);
        System.out.print(letters[10]);
=======
char[] letters={'s','a','y','b','n','c','t','d','a','e','x'};
for (int i=0;i<letters.length;i++){
    if(i%2==0){
        System.out.print(letters[i]);
    }
}
>>>>>>> 13e2030b106a9a10f908b925c32a3cde0facc799
    }
}
