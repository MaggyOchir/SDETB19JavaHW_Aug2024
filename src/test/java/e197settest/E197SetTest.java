package e197settest;

import org.example.e197.E197Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class E197SetTest {

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
    public void testHashSetContents() {
        // Execute the main method to produce the output
        E197Set.main(new String[]{});
        // Retrieve the actual output
        String actualOutput = outContent.toString();
        // Verify the output contains all expected elements
        assertTrue(actualOutput.contains("Red"));
        assertTrue(actualOutput.contains("Pink"));
        assertTrue(actualOutput.contains("Yellow"));
        assertTrue(actualOutput.contains("White"));
        assertTrue(actualOutput.contains("Black"));
        // Verify the output contains the correct size of the HashSet
        assertTrue(actualOutput.contains("Size of the Hash Set: 5"));
    }
}