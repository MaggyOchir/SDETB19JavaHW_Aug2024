package e174interfaceTest;

import org.example.e174.E174InterfaceClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E174InterfaceClassTest {
    @Test
    public void testMethod1() {
        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        E174InterfaceClass.main(new String[]{});
        // Call the method
        //E174InterfaceClass obj = new E174InterfaceClass();
        //obj.method1();

        // Restore original System.out and get the captured output
        System.setOut(System.out);
        String expectedOutput = "implementation of method1\n" +
                "implementation of method2\n";
        assertEquals(expectedOutput, outputStream.toString().replace("\r\n", "\n"));
    }
}
