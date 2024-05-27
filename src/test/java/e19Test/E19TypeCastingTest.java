package e19Test;

import org.example.e19.E19ActivityTimeTracker;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class E19ActivityTimeTrackerTester {

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
    void testActivityTimeTracker() {
        E19ActivityTimeTracker.main(new String[]{});
        String expectedOutput = "The original total time is 136.4 minutes." + System.lineSeparator() +
                "The converted time is 2 hours and 16 minutes." + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program declares the variables 'activity1', 'activity2', and 'activity3', calculates the total time, performs type casting correctly, and prints the results as specified.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
