package e123variablestest;

import org.example.e123.E123Variables;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class E123VariablesTest {

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
        E123Variables.main(new String[]{}); // Run the main method to capture its output
        // Construct the expected output string
        String expectedOutput = "0" + System.lineSeparator() +
                "null" + System.lineSeparator() +
                "0.0" + System.lineSeparator() +
                "false" + System.lineSeparator() +
                "0.0" + System.lineSeparator();
        assertEquals("The output does not match the expected output", expectedOutput, outContent.toString());
    }
}
