package e199settest;

import org.example.e199.E199Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E199SetTest {

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
    public void testLinkedHashSetOutputs() {
        // Execute the main method to produce the output
        E199Set.main(new String[]{});
        // Build the expected output string using System.lineSeparator() for line breaks
        String lineSeparator = System.lineSeparator();
        String expectedOutput = "null" + lineSeparator +
                "Sohil" + lineSeparator +
                "Diego" + lineSeparator +
                "Alijon" + lineSeparator +
                "Asel" + lineSeparator +
                "Sumair" + lineSeparator +
                "null" + lineSeparator +
                "Sohil" + lineSeparator +
                "Diego" + lineSeparator +
                "Alijon" + lineSeparator +
                "Asel" + lineSeparator +
                "Sumair" + lineSeparator;
        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput, outContent.toString());
    }
}