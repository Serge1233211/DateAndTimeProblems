package Prob4;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BirthdayAndDateComparisonExample {
    public static void main(String[] args) {
        // Создаем объект LocalDate с датой рождения
        LocalDate birthday = LocalDate.of(1990, 5, 1);

        // Выводим информацию о дне недели, дне в году, месяце и годе
        System.out.println("День недели рождения: " + birthday.getDayOfWeek());
        System.out.println("День в году рождения: " + birthday.getDayOfYear());
        System.out.println("Месяц рождения: " + birthday.getMonth());
        System.out.println("Год рождения: " + birthday.getYear());

        // Создаем объект LocalDate для текущего времени
        LocalDate currentDate = LocalDate.now();

        // Выводим информацию о текущем дне недели, дне в году, месяце и годе
        System.out.println("\nТекущий день недели: " + currentDate.getDayOfWeek());
        System.out.println("Текущий день в году: " + currentDate.getDayOfYear());
        System.out.println("Текущий месяц: " + currentDate.getMonth());
        System.out.println("Текущий год: " + currentDate.getYear());

        // Сравниваем текущую дату с днем рождения
        boolean isAfter = currentDate.isAfter(birthday);
        boolean isBefore = currentDate.isBefore(birthday);

        // Выводим результаты сравнения
        System.out.println("\nТекущая дата после дня рождения: " + isAfter);
        System.out.println("Текущая дата до дня рождения: " + isBefore);

        // Вычисляем разницу в днях
        long daysDifference = Math.abs(currentDate.toEpochDay() - birthday.toEpochDay());
        System.out.println("Разница в днях: " + daysDifference);
    }
}
