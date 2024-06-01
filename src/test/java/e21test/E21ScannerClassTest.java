package e21test;

import org.example.e21.E21AgeCalculation;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class E21ScannerClassTest {

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
    void testAgeCalculation() {
        String simulatedInput = "30\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E21AgeCalculation.main(new String[]{});
        String expectedOutput = "Enter your age" + System.lineSeparator() +
                "Your age after 10 years is 40" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program captures the age correctly and prints the future age as specified.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
