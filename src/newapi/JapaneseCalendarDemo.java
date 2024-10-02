package newapi;

import java.time.LocalDate;
import java.time.chrono.JapaneseDate;

public class JapaneseCalendarDemo {

    public static void main(String[] args) {
        JapaneseDate japaneseDate = JapaneseDate.now();
        LocalDate localDate = LocalDate.now();
        System.out.println(japaneseDate);
        System.out.println(localDate);

        //converting
        JapaneseDate japaneseDate1 = JapaneseDate.from(localDate);
        LocalDate localDate1 = LocalDate.from(japaneseDate);
        System.out.println(localDate1);
        System.out.println(japaneseDate1);
    }
}
