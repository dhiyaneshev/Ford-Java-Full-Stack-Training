package dateandtimeapi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.time.LocalDateTime.now;

public class DateTimeFormatterExample {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.parse(now().toString());
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss")));
    }
}