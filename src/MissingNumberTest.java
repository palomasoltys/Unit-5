import static org.junit.Assert.*;

import org.junit.Test;
public class MissingNumberTest {
    private int[] missingMax = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    private int[] missingNone = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    private int[] missingSeven = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };

    @Test
    public void testMissingNumber_MissingMax() {
        assertEquals(10, MissingNumber.missingNumber(missingMax, 10));
    }

    @Test
    public void testMissingNumber_NoneMissing() {
        assertEquals(0, MissingNumber.missingNumber(missingNone, 10));
    }

    @Test
    public void testMissingNumber_MissingSeven() {
        assertEquals(7, MissingNumber.missingNumber(missingSeven, 10));
    }

}
