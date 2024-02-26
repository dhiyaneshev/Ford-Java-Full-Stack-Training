package dateandtimeapi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date1 = sc.nextLine();
        String date2 = sc.nextLine();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate1 = LocalDate.parse(date1, dateFormatter);
        LocalDate localDate2 = LocalDate.parse(date2, dateFormatter);
        if(localDate1.isBefore(localDate2)){
            System.out.println("First date is before the second date.");
        }else if(localDate1.isAfter(localDate2)){
            System.out.println("First date is after the second date.");
        }else{
            System.out.println("First date is equal to second date.");
        }
    }
}
