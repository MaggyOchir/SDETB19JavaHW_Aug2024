package e188listtest;

import org.example.e188.E188List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E188ListTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final ByteArrayInputStream testIn = new ByteArrayInputStream("4\n62\n8\n5\n4\n".getBytes());

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setIn(testIn);
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(System.in);
    }

    @Test
    public void testArrayListInputs() {
        E188List.main(new String[]{});
        String expectedOutput = "4 62 8 5 4 ";
        assertEquals(expectedOutput, outContent.toString());
    }
}