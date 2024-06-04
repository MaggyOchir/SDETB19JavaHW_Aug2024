package e28test;

import org.example.e28.E28ShapeIdentifier;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class E28ShapeIdentifierTester {

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
    void testRectangle() {
        String simulatedInput = "18\n16\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E28ShapeIdentifier.main(new String[]{});
        String expectedOutput = "Please enter the length" + System.lineSeparator() +
                                "Please enter the width" + System.lineSeparator() +
                                "The shape of your object is rectangle" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for a rectangle.\n" +
                "Please ensure that your program captures the length and width correctly and identifies the shape as rectangle.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testSquare() {
        String simulatedInput = "16\n16\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E28ShapeIdentifier.main(new String[]{});
        String expectedOutput = "Please enter the length" + System.lineSeparator() +
                                "Please enter the width" + System.lineSeparator() +
                                "The shape of your object is square" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for a square.\n" +
                "Please ensure that your program captures the length and width correctly and identifies the shape as square.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
