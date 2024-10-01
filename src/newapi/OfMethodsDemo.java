package newapi;

import java.time.*;

public class OfMethodsDemo {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, Month.MARCH, 18);
        LocalTime time = LocalTime.of(14, 30);
        LocalDateTime dateTime = LocalDateTime.of(2015, 3, 18, 14, 30);
        ZoneId newYorkTimeZone = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2015, 3, 18, 14, 30,  0, 0, newYorkTimeZone);
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(zonedDateTime);

        LocalDate someDate = LocalDate.ofEpochDay(1000); //1000 days after epoch day
        LocalDate dayIn2000 = LocalDate.ofYearDay(2000, 100); //100th day in year 2000
        System.out.println(someDate);
        System.out.println(dayIn2000);
    }
}
