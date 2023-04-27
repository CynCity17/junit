import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {
    @Test
    public void testAddition(){
        int input1 = 6;
        int input2 = 8;
        int expectedResult = 14;

        assertEquals(expectedResult, Calculator.add(input1, input2));
    }

    @Test
    public void testTipCalculator(){
        double cost = 22.56;
        double tipPercentage = 15;
        double tip = 3.38;

        assertEquals(tip, Calculator.calculateTip(cost, tipPercentage), 0.01);
    }

    @Test
    public void testStringSame() {
        String expected = "CodeUp";
        String actual = "CodeUp";

        assertEquals(expected, actual);
    }

    @Test
    public void testStringNotSame(){
        String expected = "CodeUp";
        String actual = "Codeup";

        assertNotEquals(expected, actual);
    }

    @Test
    public void testArrayList(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void arraySameness(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testTrue() {
        String language = "PHP";

        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));
    }

    @Test
    public void testNull(){
        String language = null;
        language = "Java";

        assertNull(null);
        assertNotNull(language);
    }





}
