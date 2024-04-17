package e176interfacetest;

import org.example.e176.E176MultipleInterface;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E176MultipleInterfaceTest {
    @Test
    public void testMethod1() {
        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        E176MultipleInterface.main(new String[]{});


        // Restore original System.out and get the captured output
        System.setOut(System.out);
        String expectedOutput = "Parent Method-welcome to Syntax\n" +
                "Child Method-hello Syntax\n";
        assertEquals(expectedOutput, outputStream.toString().replace("\r\n", "\n"));
    }
}
