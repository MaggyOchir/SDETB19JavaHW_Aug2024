package e172abstractclasstest;

import org.example.e172.E172AbstractClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E172AbstractClassTest {
    @Test
    public void testM1() {
        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        E172AbstractClass.main(new String[]{});

        // Restore original System.out and get the captured output
        System.setOut(System.out);
        String expectedOutput = "Child class providing implementation\n" +
                "Parent class providing implementation\n";
        assertEquals(expectedOutput, outputStream.toString().replace("\r\n", "\n"));
    }

}
