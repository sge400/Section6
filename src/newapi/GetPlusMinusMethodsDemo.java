package newapi;

import enumeration.Day;

import java.time.*;

public class GetPlusMinusMethodsDemo {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2015, 3, 18);
        int year = localDate.getYear();
        Month month = localDate.getMonth();
        int day = localDate.getDayOfMonth();
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();

        LocalDateTime localDateTime = LocalDateTime.now();
        int hour = localDateTime.getHour();

        LocalDate ld1 = localDate.plusDays(6); //2015-03-24
        LocalDate ld2 = localDate.plusMonths(6).plusWeeks(3);
        LocalDate ld3 = localDate.plusWeeks(2);

        LocalDate ld4 = localDate.minusMonths(9);
        LocalDate ld5 = localDate.minusYears(7);

        System.out.println(ld1);
        System.out.println(ld2);
        System.out.println(ld3);
        System.out.println(ld4);
        System.out.println(ld5);

    }
}
