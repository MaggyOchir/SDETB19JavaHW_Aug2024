package e175interfacetest;


import org.example.e175.E175MultipleInterface;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E175MultipleInterfaceTest {
    @Test
    public void testMethod1() {
        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        E175MultipleInterface.main(new String[]{});


        // Restore original System.out and get the captured output
        System.setOut(System.out);
        String expectedOutput = "First Method implementing multiple Inheritance\n" +
                "Second Method implementing multiple Inheritance\n";
        assertEquals(expectedOutput, outputStream.toString().replace("\r\n", "\n"));
    }
}
