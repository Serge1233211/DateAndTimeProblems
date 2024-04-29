package Prob5;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class HolidayScheduleExample {
    public static void main(String[] args) {
        // Get the current year
        int currentYear = LocalDate.now().getYear();

        // Define some holidays (you can add more as needed)
        LocalDate newYearsDay = LocalDate.of(currentYear, Month.JANUARY, 1);
        LocalDate myBirthday = LocalDate.of(currentYear, Month.SEPTEMBER, 27);

        // Format the dates
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d");

        // Print the holiday schedule
        System.out.println("\"New Year's Day\" - " + newYearsDay.format(formatter));
        System.out.println("\"My birthday\" - " + myBirthday.format(formatter));
        // Add more holidays here...

        // You can continue adding other holidays in a similar format
    }
}
