package Prob5;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class HolidayScheduleExample {
    public static void main(String[] args) {
        // Get the current year
        int currentYear = LocalDate.now().getYear();

        // Define some holidays
        LocalDate newYearsDay = LocalDate.of(currentYear, Month.JANUARY, 1);
        LocalDate myBirthday = LocalDate.of(currentYear, Month.SEPTEMBER, 27);
        LocalDate valentinesDay = LocalDate.of(currentYear, Month.FEBRUARY, 14);
        LocalDate internationalWorkersDay = LocalDate.of(currentYear, Month.MAY, 1);
        LocalDate halloween = LocalDate.of(currentYear, Month.OCTOBER, 31);
        LocalDate christmas = LocalDate.of(currentYear, Month.DECEMBER, 25);

        // Format the dates
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d");

        // Print the holiday schedule
        System.out.println("\"New Year's Day\" - " + newYearsDay.format(formatter));
        System.out.println("\"My birthday\" - " + myBirthday.format(formatter));
        System.out.println("\"Valentine's Day\" - " + valentinesDay.format(formatter));
        System.out.println("\"International Workers' Day\" - " + internationalWorkersDay.format(formatter));
        System.out.println("\"Halloween\" - " + halloween.format(formatter));
        System.out.println("\"Christmas\" - " + christmas.format(formatter));
    }
}
