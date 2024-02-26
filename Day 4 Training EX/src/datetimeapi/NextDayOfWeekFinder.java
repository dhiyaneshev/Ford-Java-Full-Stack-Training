package dateandtimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class NextDayOfWeekFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String day = sc.nextLine();
        DayOfWeek dayOfWeek = DayOfWeek.valueOf(day.toUpperCase());
        LocalDate localDate = LocalDate.parse(date);
        LocalDate nextDate = localDate.with(TemporalAdjusters.next(dayOfWeek));
        System.out.println(nextDate);
    }
}