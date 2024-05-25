package e143constructortest;

import org.example.e143.E143Constructor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
public class E143ConstructorTest  {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        private final PrintStream originalOut = System.out;

        @Before
        public void setUpStreams() {
            // Redirects System.out to capture the console output
            System.setOut(new PrintStream(outContent));
        }

        @After
        public void restoreStreams() {
            // Restores System.out after the test
            System.setOut(originalOut);
        }

        @Test
        public void testMainMethodOutput() {
            // Execute the main method to generate output
            E143Constructor.main(new String[]{});
            // Construct the expected output string based on the hardcoded examples in the main method
            String expectedOutput =
                    "Toyota Prius 4 120 30000.0" +System.lineSeparator()+
                            "Toyota Prius 4 120 30000.0" +System.lineSeparator()+
                            "unknown unknown 4 120 30000.0"+System.lineSeparator()+
                            "Toyota Prius 4 90 0.0"+System.lineSeparator();
            // Asserts that the captured output matches the expected output
            assertEquals("The output from the main method does not match the expected output", expectedOutput.trim(), outContent.toString().trim());
        }
}