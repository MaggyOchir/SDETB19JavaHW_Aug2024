package e208maptest;

import org.example.e208.E208Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E208MapTest {

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
    public void testMainOutput() {
        E208Map.main(new String[]{}); // Directly test the main method
        // Build the expected output using System.lineSeparator() for newline characters
        String expectedOutput = "orange : 20" + System.lineSeparator() +
                "apple : 30" + System.lineSeparator() +
                "mango : 10" + System.lineSeparator() +
                "map is empty" + System.lineSeparator();
        // Ensure the output matches exactly what is expected
        assertEquals("The output from main did not match the expected results.", expectedOutput, outContent.toString());
    }
}