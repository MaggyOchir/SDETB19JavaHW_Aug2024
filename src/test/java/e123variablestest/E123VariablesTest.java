package e123variablestest;

import org.example.e123.E123Variables;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;

public class E123VariablesTest {

    @Test
    public void testInstanceVariables() {
        try {
            // Use reflection to access the instance variables
            E123Variables obj = new E123Variables();

            Field intField = E123Variables.class.getDeclaredField("intValue");
            Field stringField = E123Variables.class.getDeclaredField("stringValue");
            Field doubleField = E123Variables.class.getDeclaredField("doubleValue");
            Field booleanField = E123Variables.class.getDeclaredField("booleanValue");
            Field floatField = E123Variables.class.getDeclaredField("floatValue");

            intField.setAccessible(true);
            stringField.setAccessible(true);
            doubleField.setAccessible(true);
            booleanField.setAccessible(true);
            floatField.setAccessible(true);

            // Capture output from instance variables
            String output = intField.get(obj) + "\n" +
                            stringField.get(obj) + "\n" +
                            doubleField.get(obj) + "\n" +
                            booleanField.get(obj) + "\n" +
                            floatField.get(obj);

            // Adding a detailed failure message
            String failureMessage = "The output does not match the expected default values.";

            assertEquals(failureMessage, "0\nnull\n0.0\nfalse\n0.0", output);
        } catch (Exception e) {
            e.printStackTrace();
            assertEquals("Instance variables not implemented correctly.", true, false);
        }
    }
}
