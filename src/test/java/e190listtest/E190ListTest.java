package e190listtest;

import org.example.e190.E190List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E190ListTest {

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
    public void testFibonacciLinkedListOutput() {
        // Execute the main method to produce the output
        E190List.main(new String[]{});
        // Build the expected output string
        String expectedOutput = "0 1 1 2 3 5 8 13 21 34 ";
        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput, outContent.toString());
    }
}