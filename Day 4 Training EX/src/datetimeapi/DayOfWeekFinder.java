package dateandtimeapi;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;

public class DayOfWeekFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input date (yyyy-MM-dd): ");
        String date = sc.nextLine();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(date, dateFormatter);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println("Day of week: "+dayOfWeek.toString());
    }
}