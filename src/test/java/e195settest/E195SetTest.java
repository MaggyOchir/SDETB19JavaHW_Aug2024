package e195settest;

import org.example.e195.E195Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class E195SetTest {

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
    public void testHashSetOutputs() {
        // Execute the main method to produce the output
        E195Set.main(new String[]{});
        // Convert output stream to a string and split it into an array
        String[] outputs = outContent.toString().split(System.lineSeparator());
        // Check that the output contains both elements and only these elements
        assertTrue(outputs.length == 2);
        assertTrue(java.util.Arrays.asList(outputs).contains("999"));
        assertTrue(java.util.Arrays.asList(outputs).contains("111"));
    }
}