import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class NextDateCalculatorTest {

    @Test
    public void testGetNextDate() {
        // Testing for various cases

        // Case 1: Regular day, month, year
        assertArrayEquals(new int[]{2, 4, 2024}, NextDateCalculator.getNextDate(1, 4, 2024));

        // Case 2: End of month
        assertArrayEquals(new int[]{1, 5, 2024}, NextDateCalculator.getNextDate(30, 4, 2024));

        // Case 3: End of year
        assertArrayEquals(new int[]{1, 1, 2025}, NextDateCalculator.getNextDate(31, 12, 2024));

        // Case 4: Leap year
        assertArrayEquals(new int[]{29, 2, 2024}, NextDateCalculator.getNextDate(28, 2, 2024));

        // Case 5: Leap year but not a leap day
        assertArrayEquals(new int[]{1, 3, 2024}, NextDateCalculator.getNextDate(29, 2, 2024));

        // Case 6: Edge case for February
        assertArrayEquals(new int[]{1, 3, 2025}, NextDateCalculator.getNextDate(28, 2, 2025));
    }
}
