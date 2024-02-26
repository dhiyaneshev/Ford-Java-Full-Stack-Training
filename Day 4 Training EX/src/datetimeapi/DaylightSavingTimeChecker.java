package dateandtimeapi;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DaylightSavingTimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(date,dateFormatter);
        ZoneId zone = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate.atStartOfDay(),zone);
        boolean isDayLightSavingsTime = zone.getRules().isDaylightSavings(zonedDateTime.toInstant());
        if(isDayLightSavingsTime){
            System.out.println("The date is within the daylight saving time period.");
        }else{
            System.out.println("The date is not within the daylight saving time period.");
        }

    }
}