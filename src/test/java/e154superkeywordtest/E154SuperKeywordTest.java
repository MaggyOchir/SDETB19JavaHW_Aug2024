package e154superkeywordtest;

import org.example.e154.E154SuperKeyword;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E154SuperKeywordTest {

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
    public void testConstructorOutputs() {
        // Execute the main method to generate output
        E154SuperKeyword.main(new String[]{});
        // The expected output sequence as described in the requirements
        String expectedOutput = "Parent Constructor without argument" + System.lineSeparator() +
                "Child Constructor without argument" + System.lineSeparator() +
                "10";

        // Asserts that the captured output matches the expected output sequence
        assertEquals("The output from the main method does not match the expected output.", expectedOutput, outContent.toString().trim());
    }
}
