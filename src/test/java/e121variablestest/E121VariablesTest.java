package e121variablestest;


import org.example.e121.E121Variables;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class E121VariablesTest {

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
        E121Variables.main(new String[]{}); // Run the main method to capture its output
        // Building the expected output string
        String expectedOutput = String.join(System.lineSeparator(),
                "10",
                "10.23",
                "a",
                "100",
                "100.23",
                "s",
                "") ; // Adding an extra lineSeparator for the final println newline

        assertEquals("The output does not match the expected output", expectedOutput, outContent.toString());
    }
}