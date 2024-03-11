package e81arraystest;
import static org.junit.Assert.*;

import org.example.e81.E81Arrays;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class E81ArraysTest{

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
    public void testPrintHighestValue() {
        int[] inputArray = {5, 4, 8};
        E81Arrays.main(inputArray); // Replace with your actual method call

        String expectedOutput = "8";
        String failureMessage = "The output does not match the expected value.\n" +
                "Please ensure that your program correctly finds and prints the highest value in the array.\n";

        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}