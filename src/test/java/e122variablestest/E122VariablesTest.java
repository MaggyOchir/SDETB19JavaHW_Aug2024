package e122variablestest;

import org.example.e122.E122Variables;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class E122VariablesTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testOutput() {
        E122Variables.main(new String[]{}); // Run the main method to capture its output
        // Construct the expected output string
        String expectedOutput = "The capital of USA is Washington DC and population is 330000000" + System.lineSeparator() +
                "The capital of Kazakhstan is Astana and population is 18500000" + System.lineSeparator();
        assertEquals("The output does not match the expected output", expectedOutput, outContent.toString());
    }
}