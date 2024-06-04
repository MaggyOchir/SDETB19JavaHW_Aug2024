# Exercise 27: Personalized Discount Calculator

## Objective
Learn how to use the `Scanner` class in Java to capture string and numerical input from the user, and use simple `if-else` conditions to perform calculations and print personalized messages.

## Instructions

**Personalized Discount Calculator**

In this project, you will write a small program that asks the user for their name and the amount they spent, then calculates and prints a personalized discount message based on the amount spent.

**For you to do:**

1. **Create a Scanner Object**
    - Create a `Scanner` object to read input from the console.

2. **Capture User's Name**
    - Print "Please enter your name".
    - Capture the user's input using the `Scanner` object and store it in a variable called `name`.

3. **Capture Amount Spent**
    - Print "Please enter the amount you spent".
    - Capture the user's input using the `Scanner` object and store it in a variable called `amountSpent`.

4. **Calculate Discount**
    - If the `amountSpent` is greater than 100, apply a 10% discount.
    - Otherwise, apply a 5% discount.

5. **Print Personalized Discount Message**
    - Print a message in the format: `"Hello name, you spent amountSpent. Your discount is discountAmount."`

## Expected Output
```
Please enter your name
Alice
Please enter the amount you spent
150
Hello Alice, you spent 150. Your discount is 15.0.
Please enter your name
Bob
Please enter the amount you spent
50
Hello Bob, you spent 50. Your discount is 2.5.
```

## Tips
- Remember to import the `Scanner` class using `import java.util.Scanner;`.
- Ensure your variables are declared and assigned correctly.
- Use the `nextDouble` method of the `Scanner` class to capture the numerical input.
- Use the `equals` method of the `String` class to compare strings.

## Additional Information
- **Scanner Class**: The `Scanner` class is used to get user input. It is found in the `java.util` package.
- **Conditional Statements**: Use `if-else` statements to make decisions based on conditions.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect variable declarations.
- If the output is not as expected, ensure that the input is captured and printed correctly.

By following these steps, you should be able to successfully complete the exercise and understand how to use the `Scanner` class and `if-else` conditions in Java. Happy coding!
