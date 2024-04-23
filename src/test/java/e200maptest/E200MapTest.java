package e200maptest;

import org.example.e200.E200Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E200MapTest {

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
    public void testMapOutputs() {
        // Execute the main method to produce the output
        E200Map.main(new String[]{});
        // Build the expected output string using System.lineSeparator() for line breaks
        String lineSeparator = System.lineSeparator();
        String expectedOutput = "Patrick ST" + lineSeparator +
                "265" + lineSeparator +
                "Vienna" + lineSeparator +
                "22180" + lineSeparator +
                "United State" + lineSeparator;
        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput, outContent.toString());
    }
}
