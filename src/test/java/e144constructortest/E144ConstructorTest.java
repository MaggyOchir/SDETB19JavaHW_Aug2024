package e144constructortest;

import org.example.e144.E144Constructor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
public class E144ConstructorTest {
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
        E144Constructor.main(new String[]{});
        // Construct the expected output string based on the hardcoded examples in the main method
        String expectedOutput =
                "Eggs 3.0 Produce true 10\n" +
                        "Paper Towels 2.0 misc false 24\n" +
                        "Paper Towels 2.0 null false 0\n"; // Corrected to match expected constructor behavior
        // Asserts that the captured output matches the expected output
        assertEquals("The output from the main method does not match the expected output", expectedOutput.trim(), outContent.toString().trim());
    }
}