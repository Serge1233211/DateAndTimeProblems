package Prob1;

import java.time.YearMonth;
import java.time.Year;
public class MonthLengths {
    public static void main(String[] args) {
        int currentYear = Year.now().getValue();
        printMonthLengths(currentYear);
    }

    public static void printMonthLengths(int year) {
        YearMonth january = YearMonth.of(year, 1);
        int daysInJanuary = january.lengthOfMonth();
        System.out.println("January " + year + " has " + daysInJanuary + " days.");
    }
}
