# Exercise 28: Shape Identifier

## Objective
Learn how to use the `Scanner` class in Java to capture numerical input from the user and use simple `if-else` conditions to identify the shape based on length and width.

## Instructions

**Shape Identifier**

In this project, you will write a small program that asks the user for the length and width of an object and then identifies whether the shape is a square or a rectangle.

**For you to do:**

1. **Create a Scanner Object**
    - Create a `Scanner` object to read input from the console.

2. **Capture Length and Width**
    - Print "Please enter the length".
    - Capture the user's input using the `Scanner` object and store it in a variable called `length`.
    - Print "Please enter the width".
    - Capture the user's input using the `Scanner` object and store it in a variable called `width`.

3. **Identify the Shape**
    - Use an `if-else` statement to check if the `length` and `width` are equal.
    - If they are equal, print "The shape of your object is square".
    - If they are not equal, print "The shape of your object is rectangle".

## Expected Output
```
Examples:
Please enter the length
18
Please enter the width
16
The shape of your object is rectangle
Please enter the length
16
Please enter the width
16
The shape of your object is square
```

## Tips
- Remember to import the `Scanner` class using `import java.util.Scanner;`.
- Ensure your variables are declared and assigned correctly.
- Use the `nextDouble` method of the `Scanner` class to capture the numerical input.

## Additional Information
- **Scanner Class**: The `Scanner` class is used to get user input. It is found in the `java.util` package.
- **Conditional Statements**: Use `if-else` statements to make decisions based on conditions.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect variable declarations.
- If the output is not as expected, ensure that the input is captured and printed correctly.

By following these steps, you should be able to successfully complete the exercise and understand how to use the `Scanner` class and `if-else` conditions in Java. Happy coding!
