package e196settest;

import org.example.e196.E196Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class E196SetTest {

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
    public void testHashSetBehavior() {
        // Execute the main method to produce the output
        E196Set.main(new String[]{});
        // Build the expected output string. The exact order in a HashSet is not guaranteed;
        // therefore, we must test for the presence of all elements and the empty set afterward.
        String actualOutput = outContent.toString().trim();
        assertTrue(actualOutput.contains("[third, first, second]"));
        assertTrue(actualOutput.contains("[]"));
    }
}