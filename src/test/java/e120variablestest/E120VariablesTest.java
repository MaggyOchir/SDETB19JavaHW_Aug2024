package e120variablestest;

import org.example.e120.E120Variables;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E120VariablesTest {

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
        E120Variables.main(new String[]{}); // Run the main method to capture its output
        String expectedOutput = "I am a student of batch 6 studying at Syntax in the year of 2020"+System.lineSeparator(); // Include the newline at the end as System.out.println adds it
        assertEquals(expectedOutput, outContent.toString());
    }
}