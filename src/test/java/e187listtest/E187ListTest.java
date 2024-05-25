package e187listtest;

import org.example.e187.E187List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E187ListTest {

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
    public void testArrayListAfterRemovals() {
        // Execute the main method to produce the output
        E187List.main(new String[]{});
        // Build the expected output string
        String expectedOutput = "yo yolo ";
        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput, outContent.toString());
    }
}