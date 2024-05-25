package e180encapsulationtest;

import org.example.e180.E180Encapsulation;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E180EncapsulationTest {
    @Test
    public void testMainMethodOutput() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Execute the main method
        E180Encapsulation.main(new String[]{});

        // Restore the original System.out
        System.setOut(originalOut);

        // Check the output
        String expectedOutput = "Employee Name: John\nEmployee Age: 30";
        assertEquals(expectedOutput, outputStream.toString().replace("\r\n", "\n"));
    }
}
