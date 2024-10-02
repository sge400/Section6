package newapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ParsingDemo {

    public static void main(String[] args) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String dateString = "2015-03-18"; //follow the same pattern as your formatter
        String timeString = "15:30:00";
        String dateTimeString = "18/03/2015 15:30:00";

        LocalDate localDate = LocalDate.parse(dateString, dateFormatter);
        LocalTime localTime = LocalTime.parse(timeString, timeFormatter);
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeString, dateTimeFormatter);
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
    }
}
