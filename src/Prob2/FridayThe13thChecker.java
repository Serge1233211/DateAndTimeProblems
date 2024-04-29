package Prob2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class FridayThe13thChecker {
    public static void main(String[] args) {
        LocalDate dateToCheck = LocalDate.of(2024, 4, 13); // Replace with your desired date
        boolean isFridayThe13th = checkFridayThe13th(dateToCheck);
        System.out.println("Is " + dateToCheck + " a Friday the 13th? " + isFridayThe13th);
    }

    public static boolean checkFridayThe13th(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13;
    }
}
