import java.util.Calendar;

public class NextDateCalculator {

    public static int[] getNextDate(int d, int m, int y) {
        int[] result = new int[3];

        Calendar cal = Calendar.getInstance();
        cal.set(y, m - 1, d); // Note: Month in Calendar is 0-based

        cal.add(Calendar.DATE, 1);

        result[0] = cal.get(Calendar.DATE);
        result[1] = cal.get(Calendar.MONTH) + 1; // Adding 1 as Calendar month is 0-based
        result[2] = cal.get(Calendar.YEAR);

        return result;
    }
}
