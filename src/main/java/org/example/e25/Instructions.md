# Exercise 25: Daily Expense Tracker

## Objective
Learn how to use the `Scanner` class in Java to capture numerical input from the user, perform basic arithmetic operations, and use simple `if-else` conditions.

## Instructions

**Daily Expense Tracker**

In this project, you will write a small program that asks the user to input their daily expenses and calculates the total. The program will also determine if the total expenses are within a specified budget.

**For you to do:**

1. **Create a Scanner Object**
    - Create a `Scanner` object to read input from the console.

2. **Capture Daily Expenses**
    - Print "Please enter your morning expense".
    - Capture the user's input using the `Scanner` object and store it in a variable called `morningExpense`.
    - Print "Please enter your afternoon expense".
    - Capture the user's input using the `Scanner` object and store it in a variable called `afternoonExpense`.
    - Print "Please enter your evening expense".
    - Capture the user's input using the `Scanner` object and store it in a variable called `eveningExpense`.

3. **Calculate Total Expense**
    - Calculate the sum of the three expenses and store it in a variable called `totalExpense`.

4. **Check if Within Budget**
    - Define a budget variable with a value, for example, `budget = 100.0`.
    - Use an `if-else` statement to check if the `totalExpense` is within the budget.

5. **Print the Results**
    - Print the total expense in the format: `"Your total daily expense is: totalExpense"`.
    - Print if the expense is within the budget or over the budget.

## Expected Output
```
Please enter your morning expense
20.50
Please enter your afternoon expense
30.75
Please enter your evening expense
25.00
Your total daily expense is: 76.25
You are within the budget.
Please enter your morning expense
50.00
Please enter your afternoon expense
40.00
Please enter your evening expense
30.00
Your total daily expense is: 120.00
You are over the budget.
```

## Tips
- Remember to import the `Scanner` class using `import java.util.Scanner;`.
- Ensure your variables are declared and assigned correctly.
- Use the `nextDouble` method of the `Scanner` class to capture the input.

## Additional Information
- **Scanner Class**: The `Scanner` class is used to get user input. It is found in the `java.util` package.
- **If-Else Conditions**: Use `if-else` statements to make decisions based on conditions.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect variable declarations.
- If the output is not as expected, ensure that the input is captured and printed correctly.

By following these steps, you should be able to successfully complete the exercise and understand how to use the `Scanner` class and `if-else` conditions in Java. Happy coding!
