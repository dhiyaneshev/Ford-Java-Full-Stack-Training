package dateandtimeapi;

//import java.time.LocalDate;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DurationCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date1 = sc.nextLine();
        String date2 = sc.nextLine();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDate1 = LocalDateTime.parse(date1, dateTimeFormatter);
        LocalDateTime localDate2 = LocalDateTime.parse(date2, dateTimeFormatter);
        Duration duration = Duration.between(localDate1,localDate2);
        System.out.println("Duration: "+duration.toDays()+" days, "+duration.toHours()
                +" hours, "+duration.toMinutes()+" minutes, and "+duration.toSeconds()+" seconds");
    }
}