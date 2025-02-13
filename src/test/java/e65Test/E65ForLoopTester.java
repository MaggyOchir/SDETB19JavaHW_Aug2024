package e65Test;

import org.example.e65.E65ForLoop;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class E65ForLoopTester {

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
        String simulatedInput = "7\n12\n20\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E65ForLoop.main(new String[]{});
        String expectedOutput = "In: 6 5 4 3 2 1 0 " + System.lineSeparator() +
                                "In: 11 10 9 8 7 6 5 4 3 2 1 0 " + System.lineSeparator() +
                                "In: 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0 " + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the for loop.\n" +
                "Please ensure that your program correctly uses the for loop to print a series of numbers in reverse based on user input.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
