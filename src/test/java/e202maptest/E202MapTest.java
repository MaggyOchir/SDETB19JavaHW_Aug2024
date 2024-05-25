package e202maptest;

import org.example.e202.E202Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class E202MapTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testMapOutput() {
        E202Map.main(new String[]{});
        String expectedOutput =
                "Key is 1 item and values is apple" + System.lineSeparator() +
                        "Key is 2 item and values is banana" + System.lineSeparator() +
                        "Key is 3 item and values is pear" + System.lineSeparator() +
                        "Key is 4 item and values is tomato" + System.lineSeparator() +
                        "Key is 5 item and values is mango" + System.lineSeparator() +
                        "Key is 6 item and values is kiwi" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}