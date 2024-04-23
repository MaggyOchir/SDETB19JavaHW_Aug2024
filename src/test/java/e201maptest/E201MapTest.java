package e201maptest;

import org.example.e201.E201Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class E201MapTest {
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
    public void testMapOperations() {
        // Redirect System.out to capture output
        System.setOut(new PrintStream(outContent));
        E201Map.main(new String[]{});
        // Split the output lines into an array
        String[] outputLines = outContent.toString().split(System.lineSeparator());
        // Check if the output has exactly two lines
        assertEquals(2, outputLines.length);
        // Check if the first output line is "5" (the map size after addition)
        assertEquals("5", outputLines[0]);
        // Check if the second output line is "0" (the map size after clear)
        assertEquals("0", outputLines[1]);
    }
}