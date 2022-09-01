package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
    BalancedBrackets bracket_test = new BalancedBrackets();
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    //TRUE TESTS
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(bracket_test.hasBalancedBrackets("[]"));
    }
    @Test
    public void testNoBrackets() {
        assertTrue(bracket_test.hasBalancedBrackets("test"));
    }
    @Test
    public void testWordInBrackets() {
        assertTrue(bracket_test.hasBalancedBrackets("[test]"));
    }
    @Test
    public void testBracketsBeforeWord() {
        assertTrue(bracket_test.hasBalancedBrackets("[]test"));
    }
    @Test
    public void testNonNestedBrackets() {
        assertTrue(bracket_test.hasBalancedBrackets("this is a [test]"));
    }
    @Test
    public void testNestedBrackets()    {
        assertTrue(bracket_test.hasBalancedBrackets("[this [is [a [test]]]]"));
    }
    //FALSE TESTS
    @Test
    public void testReversedBrackets()  {
        assertFalse(bracket_test.hasBalancedBrackets("]["));
    }
    @Test
    public void testReversedNonNestedBrackets() {
        assertFalse(bracket_test.hasBalancedBrackets("this is a ]test["));
    }
    @Test
    public void testMissingEndBracket()  {
        assertFalse(bracket_test.hasBalancedBrackets("[word"));
    }
    @Test
    public void testMissingOpeningBracket() {
        assertFalse(bracket_test.hasBalancedBrackets("word]"));
    }
    @Test
    public void onlyContainsOneBracket()    {
        assertFalse(bracket_test.hasBalancedBrackets("["));
    }
    @Test
    public void hasMultipleBrackets()   {
        assertFalse(bracket_test.hasBalancedBrackets("[][][][][][]["));
    }

}
