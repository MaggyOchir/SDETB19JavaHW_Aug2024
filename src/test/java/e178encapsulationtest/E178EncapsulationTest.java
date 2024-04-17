package e178encapsulationtest;

import org.example.e178.E178Encapsulation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E178EncapsulationTest {

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
    public void testEncapsulationDemoOutput() {
        // Execute the main method to simulate the output
        E178Encapsulation.main(new String[]{});
        String expectedOutput = "Employee Name: John\n" +
                "Employee Age: 30";
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}