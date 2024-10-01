package legacy;

import java.sql.Date;

public class JavaSQLDate {

    public static void main(String[] args) {
        //represent date while ignoring time
        Date currentDate = new Date(System.currentTimeMillis());
        java.util.Date currentDate1 = new java.util.Date(System.currentTimeMillis());
        System.out.println(currentDate); //2024-10-01
        System.out.println(currentDate1); //Tue Oct 01 11:38:40 CEST 2024


    }
}
