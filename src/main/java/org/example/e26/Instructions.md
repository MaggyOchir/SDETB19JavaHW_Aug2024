# Exercise 26: Greeting Based on Time of Day

## Objective
Learn how to use the `Scanner` class in Java to capture string input from the user and use simple `if-else` conditions to print different greetings based on the input.

## Instructions

**Greeting Based on Time of Day**

In this project, you will write a small program that asks the user for the time of day (morning, afternoon, or evening) and then prints a corresponding greeting.

**For you to do:**

1. **Create a Scanner Object**
    - Create a `Scanner` object to read input from the console.

2. **Capture User's Input**
    - Print "What time of day is it (morning, afternoon, evening)?".
    - Capture the user's input using the `Scanner` object and store it in a variable called `timeOfDay`.

3. **Conditional Statement**
    - Write a conditional statement that checks the value of `timeOfDay`.
    - If the value is "morning", print "Good morning!".
    - If the value is "afternoon", print "Good afternoon!".
    - If the value is "evening", print "Good evening!".
    - For any other input, print "Hello!".

## Expected Output
```
What time of day is it (morning, afternoon, evening)?
morning
Good morning!
What time of day is it (morning, afternoon, evening)?
afternoon
Good afternoon!
What time of day is it (morning, afternoon, evening)?
evening
Good evening!
What time of day is it (morning, afternoon, evening)?
night
Hello!
```

## Tips
- Remember to import the `Scanner` class using `import java.util.Scanner;`.
- Ensure your variables are declared and assigned correctly.
- Use the `equals` method of the `String` class to compare strings.

## Additional Information
- **Scanner Class**: The `Scanner` class is used to get user input. It is found in the `java.util` package.
- **Conditional Statements**: Use `if-else` statements to make decisions based on conditions.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect variable declarations.
- If the output is not as expected, ensure that the input is captured and printed correctly.

By following these steps, you should be able to successfully complete the exercise and understand how to use the `Scanner` class and `if-else` conditions in Java. Happy coding!
