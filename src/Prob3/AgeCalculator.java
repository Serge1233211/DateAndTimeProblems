package Prob3;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args) {
        // Example usage:
        LocalDate birthDate = LocalDate.of(1990, 5, 15);
        LocalDate givenDate = LocalDate.of(2024, 4, 29);

        int age = calculateAge(birthDate, givenDate);
        if (age >= 0) {
            System.out.println("The person's age on " + givenDate + " is " + age + " years.");
        } else {
            System.out.println("The person hasn't been born yet.");
        }
    }

    public static int calculateAge(LocalDate birthDate, LocalDate givenDate) {
        Period period = Period.between(birthDate, givenDate);
        return period.getYears();
    }
}
