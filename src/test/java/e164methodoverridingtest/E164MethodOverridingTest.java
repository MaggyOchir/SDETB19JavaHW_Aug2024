package e164methodoverridingtest;

import org.example.e164.E164MethodOverriding;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E164MethodOverridingTest {
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
    public void testMethodOverridingOutput() {
        // Execute the main method to generate output
        E164MethodOverriding.main(new String[]{});
        // Construct the expected output string using System.lineSeparator() for platform-independent newline
        String expectedOutput =
                "method in Child1 class" + System.lineSeparator() +
                        "method in Child2 class" + System.lineSeparator() +
                        "method in Child3 class";

        // Asserts that the captured output matches the expected output
        assertEquals("The output from the main method does not match the expected output.", expectedOutput.trim(), outContent.toString().trim());
    }
}
