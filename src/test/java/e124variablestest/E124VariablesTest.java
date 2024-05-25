package e124variablestest;

import org.example.e124.E124Variables;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class E124VariablesTest {

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
        E124Variables.main(new String[]{}); // Run the main method to capture its output
        // Construct the expected output string
        String expectedOutput = "Welcome To Syntax Technologies" + System.lineSeparator() +
                "Welcome To Syntax Technologies" + System.lineSeparator() +
                "Welcome To Syntax Technologies" + System.lineSeparator();
        assertEquals("The output does not match the expected output", expectedOutput, outContent.toString());
    }
}