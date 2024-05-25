package e171abstractclasstest;

import org.example.e171.E171AbstractClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E171AbstractClassTest {

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
    public void testMainMethodOutput() {
        // Call the main method to produce the output
        E171AbstractClass.main(new String[]{});
        // Build the expected output string
        String expectedOutput = "m1 without parameters" + System.lineSeparator() +
                "m1 method with parameter" + System.lineSeparator();
        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput, outContent.toString());
    }
}