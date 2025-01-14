package e64Test;

import org.example.e64.E64ForLoop;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class E64ForLoopTester {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void testForLoop() {
        String simulatedInput = "5\n8\n-5\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E64ForLoop.main(new String[]{});
        String expectedOutput = "Int: 0 1 2 3 4 5 6 7 8 9 " + System.lineSeparator() +
                                "Int: 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 " + System.lineSeparator() +
                                "Int: " + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the for loop.\n" +
                "Please ensure that your program correctly uses the for loop to print a series of numbers based on user input.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
