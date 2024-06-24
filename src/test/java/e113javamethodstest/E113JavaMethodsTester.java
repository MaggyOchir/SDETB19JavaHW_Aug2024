package e113javamethodstest;

import org.example.e113.E113JavaMethods;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class E113JavaMethodsTester {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testPrintTimeMethod() {
        E113JavaMethods.main(new String[]{});
        String expectedOutput = "11:30" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString(), "The output does not match the expected result. Ensure that you call the printTime method from the main method with the correct arguments.");
    }
}
