package e6test;

import org.example.e6.E6StringConcatenation;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class E6StringConcatenationTester {

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
    void testFullNameConcatenation() {
        E6StringConcatenation.main(new String[]{});
        String expectedOutput = "John Smith" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program creates a variable with the value 'John',\n" +
                "creates a variable with the value 'Smith', and prints them concatenated with a space in between.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
