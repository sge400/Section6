package legacy;

import java.util.Date;

public class JavaUtilDate {

    public static void main(String[] args) {

        //Default constructor
        Date currentDate = new Date(); // Current Date and Time value
        currentDate.setYear(200); //you can mutate object once created, though not recommended (and deprecated)
        System.out.println(currentDate);
        long timeInms = currentDate.getTime();
        System.out.println(timeInms);

        //By passing in date (and time)
        Date futureDate = new Date(200, 8, 26, 8, 15, 39);
        System.out.println(futureDate); //Sun Sep 26 08:15:39 CEST 2100
        long timeInms1 = futureDate.getTime();
        System.out.println(timeInms1);
        Date date = new Date(timeInms1 + 86400000); //append 24 hours
        System.out.println(date); //Mon Sep 27 08:15:39 CEST 2100

        //Comparison
        boolean isAfter = futureDate.after(date);
        System.out.println(isAfter);
        boolean isBefore = date.before(futureDate);
        System.out.println(isBefore);
        /*
        In computing, an epoch is a fixed date and time used as a reference from which a computer measures system time.
         */

    }
}
