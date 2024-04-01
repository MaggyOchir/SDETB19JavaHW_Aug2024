package e125variablestest;

import org.example.e125.E125Variables;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class E125VariablesTest {

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
        E125Variables.main(new String[]{}); // Execute the main method to capture its output
        // Construct the expected output string
        String expectedOutput = "200" + System.lineSeparator() + "200" + System.lineSeparator();
        assertEquals("The output does not match the expected output", expectedOutput, outContent.toString());
    }
}