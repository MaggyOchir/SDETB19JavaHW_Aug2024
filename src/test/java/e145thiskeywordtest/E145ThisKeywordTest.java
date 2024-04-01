package e145thiskeywordtest;

import org.example.e145.E145ThisKeyword;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
public class E145ThisKeywordTest {

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
        E145ThisKeyword.main(new String[]{});

        // Construct the expected output string using System.lineSeparator() for platform-independent newline
        String expectedOutput =
                "Tarzan Mutt 50.0" + System.lineSeparator() +
                        "Lucy Mutt 10.0" + System.lineSeparator();

        // Asserts that the captured output matches the expected output
        assertEquals("The output from the main method does not match the expected output", expectedOutput, outContent.toString());
    }
}

