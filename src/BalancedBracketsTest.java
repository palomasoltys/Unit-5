import static org.junit.Assert.*;

import org.junit.Test;
public class BalancedBracketsTest {
    String balancedParens = "(1)";
    String tooManyOpenParens = "((1";
    String tooManyOpenParens1 = "(1)(";
    String tooManyClosedParens = "(1))";
    String startClosedParens = ")(";
    String emptyString = "";
    String balancedAngleBrackets = "<<>>";
    String balancedComboBrackets = "<({})>";
    String mismatchedBrackets = "<({)}>";

    BalancedBrackets bb = new BalancedBrackets();

    @Test
    public void testBalancedBrackets_balancedParens() {
        assertTrue(BalancedBrackets.isValid("(1)"));
    }

    @Test
    public void testBalancedBrackets_tooManyOpenParens() {
        assertFalse(BalancedBrackets.isValid("({1)"));
    }

    @Test
    public void testBalancedBrackets_tooManyClosedParens() {
        assertFalse(BalancedBrackets.isValid("({1})>"));
    }

    @Test
    public void testBalancedBrackets_startWithClosedParens() {
        assertFalse(BalancedBrackets.isValid(")("));
    }

    @Test
    public void testBalancedBrackets_emptyString() {
        assertTrue(BalancedBrackets.isValid(""));
    }

    @Test
    public void testBalancedBrackets_balancedComboBrackets() {
        assertTrue(BalancedBrackets.isValid("<({})>"));
    }

    @Test
    public void testBalancedBrackets_mismatchedBrackets() {
        assertFalse(BalancedBrackets.isValid("<({)}>"));
    }
}
