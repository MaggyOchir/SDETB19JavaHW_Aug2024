package e166methodoverridingtest;

import org.example.e166.E166MethodOverriding;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E166MethodOverridingTest {
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
    public void testAnimalBehaviorOutput() {
        // Execute the main method to generate output
        E166MethodOverriding.main(new String[]{});
        // Construct the expected output string using System.lineSeparator() for platform-independent newline
        String expectedOutput = String.join(System.lineSeparator(),
                "Cat eats",
                "Cat sleeps a lot",
                "kitten1 eats milk",
                "kitten1 sleeps a lot",
                "kitten2 eats snacks",
                "kitten2 sleeps a lot",
                "kitten3 eats everything",
                "kitten3 sleeps a lot"
        );

        // Asserts that the captured output matches the expected output
        assertEquals("The output from the main method does not match the expected output.", expectedOutput, outContent.toString().trim());
    }
}

