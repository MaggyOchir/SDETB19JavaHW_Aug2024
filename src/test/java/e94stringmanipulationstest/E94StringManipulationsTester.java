package e94stringmanipulationstest;

import org.example.e94.E94StringManipulations;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class E94StringManipulationsTester {

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
    void testStringSubstring() {
        E94StringManipulations.main(new String[]{});
        String expectedOutput = "classes at Syntax" + System.lineSeparator() +
                                "I love Java" + System.lineSeparator();

        String failureMessage = "The output does not match the expected results for the substring retrieval.\n" +
                "Please ensure that your program correctly assigns the string value, retrieves the substrings, and prints the results.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
