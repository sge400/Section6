package legacy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormattingDemo {

    public static void main(String[] args) throws ParseException {
        Date currentDate = new Date();
        System.out.println(currentDate); //Tue Oct 01 10:57:19 CEST 2024
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss");
        String formattedDate = dateFormat.format(currentDate);
        System.out.println(formattedDate); //2024-10-01 10:59:13

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MM/dd/yyyy");
        String formattedDate1 = dateFormat1.format(currentDate);
        System.out.println(formattedDate1);

        String dateString = "2100-09-26 14:30:00";
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parsedDate = dateFormat2.parse(dateString);
        System.out.println(parsedDate);

    }
}
