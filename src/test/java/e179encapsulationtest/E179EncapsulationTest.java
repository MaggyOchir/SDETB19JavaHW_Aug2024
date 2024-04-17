package e179encapsulationtest;


import org.example.e179.E179Encapsulation;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E179EncapsulationTest {
    @Test
    public void testMainMethodOutput() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));


        E179Encapsulation.main(new String[]{});

        // Restore the original System.out
        System.setOut(originalOut);

        // Check the output
        String expectedOutput = "Employee Name: Mario\nEmployee Age: 32";
        assertEquals(expectedOutput, outputStream.toString().trim());
    }
}
