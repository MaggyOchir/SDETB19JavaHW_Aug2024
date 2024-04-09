package e170finalkeywordtest;

import org.example.e170.E170FinalKeyword;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E170FinalKeywordTest {

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
    public void testMainMethodCalls() {
        E170FinalKeyword.main(new String[]{}); // Execute the main method which calls the Display methods
        String expectedOutput = "Final method with boolean parameter" + System.lineSeparator() +
                "Final method with String parameter" + System.lineSeparator();
        assertEquals("The output from the main method did not match the expected output.", expectedOutput, outContent.toString());
    }}