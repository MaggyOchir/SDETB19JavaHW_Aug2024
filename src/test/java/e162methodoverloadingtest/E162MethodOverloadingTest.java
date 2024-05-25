package e162methodoverloadingtest;
import org.example.e162.E162MethodOverloading;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E162MethodOverloadingTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        // Redirects System.out to capture the console output
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        // Restores System.out after the test
        System.setOut(originalOut);
    }

    @Test
    public void testStaticMethodOverloading() {
        // Execute the main method to generate output
        E162MethodOverloading.main(new String[]{});
        // Construct the expected output string using System.lineSeparator() for platform-independent newline
        String expectedOutput =
                "static method without parameter" + System.lineSeparator() +
                        "static method with int parameter";

        // Asserts that the captured output matches the expected output
        assertEquals("The output from the main method does not match the expected output.", expectedOutput.trim(), outContent.toString().trim());
    }
}