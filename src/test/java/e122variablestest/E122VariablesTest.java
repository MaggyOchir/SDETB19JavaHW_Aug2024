package e122variablestest;

import org.example.e122.E122Variables;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class E122VariablesTest {

    @Test
    public void testInstanceVariables() {
        try {
            // Use reflection to access the instance variables and methods
            E122Variables obj1 = new E122Variables();
            E122Variables obj2 = new E122Variables();

            Field countryField = E122Variables.class.getDeclaredField("countryName");
            Field capitalField = E122Variables.class.getDeclaredField("capital");
            Field populationField = E122Variables.class.getDeclaredField("populationSize");

            Method displayMethod = E122Variables.class.getDeclaredMethod("display");

            countryField.setAccessible(true);
            capitalField.setAccessible(true);
            populationField.setAccessible(true);
            displayMethod.setAccessible(true);

            // Assign values to the first instance
            countryField.set(obj1, "USA");
            capitalField.set(obj1, "Washington DC");
            populationField.set(obj1, 330000000);

            // Assign values to the second instance
            countryField.set(obj2, "Kazakhstan");
            capitalField.set(obj2, "Astana");
            populationField.set(obj2, 18500000);

            // Capture output from display method
            String output1 = (String) displayMethod.invoke(obj1);
            String output2 = (String) displayMethod.invoke(obj2);

            // Adding a detailed failure message
            String failureMessage1 = "The output does not match the expected format for the first instance.";
            String failureMessage2 = "The output does not match the expected format for the second instance.";

            assertEquals(failureMessage1, "The capital of USA is Washington DC and population is 330000000", output1);
            assertEquals(failureMessage2, "The capital of Kazakhstan is Astana and population is 18500000", output2);
        } catch (Exception e) {
            e.printStackTrace();
            assertEquals("Instance variables or methods not implemented correctly.", true, false);
        }
    }
}
