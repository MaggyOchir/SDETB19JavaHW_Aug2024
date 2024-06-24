package e127statickeywordtest;

import org.example.e127.E127StaticKeyword;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E127StaticKeywordTest {

    @Test
    public void testMethodsOutput() {
        // Capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Create an instance of the class
        E127StaticKeyword instance = new E127StaticKeyword();

        // Call the non-static method using the instance
        try {
            E127StaticKeyword.class.getMethod("nonStaticMethod").invoke(instance);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Call the static method using the class name
        try {
            E127StaticKeyword.class.getMethod("staticMethod").invoke(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Expected output
        String expectedOutput = "Programming is amazing.\nJava is awesome.\n";

        // Assert the output
        assertEquals("Output is not as expected.", expectedOutput, outContent.toString());
    }
}
