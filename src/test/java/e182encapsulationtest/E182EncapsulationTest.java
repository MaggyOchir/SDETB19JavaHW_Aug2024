package e182encapsulationtest;
import org.example.e182.E182Encapsulation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E182EncapsulationTest {

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
    public void testPersonOutput() {
        // Execute the main method to simulate the output
        E182Encapsulation.main(new String[]{});
        String expectedOutput = String.join(System.lineSeparator(), "John", "Doe", "10/25/1900", "123-45-6789") + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}