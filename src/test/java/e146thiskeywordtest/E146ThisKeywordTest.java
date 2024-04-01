package e146thiskeywordtest;

import org.example.e146.E146ThisKeyword;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
public class E146ThisKeywordTest {
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
    public void testMainMethodOutput() {
        // Execute the main method to generate output
        E146ThisKeyword.main(new String[]{});

        // Construct the expected output string using System.lineSeparator() for platform-independent newline
        String expectedOutput =
                "null null 0 null 0" + System.lineSeparator() +
                        "Joe Smith 12345 01/01/1970 35000";

        // Asserts that the captured output matches the expected output
        assertEquals("The output from the main method does not match the expected output", expectedOutput, outContent.toString().trim());
    }
}
