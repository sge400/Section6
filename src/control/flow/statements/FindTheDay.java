package control.flow.statements;

public class FindTheDay {

    public static void main(String[] args) {
        String whatIsToday = "Saturday";

//        if (whatIsToday.equals("Monday")) {
//            System.out.println("It is a week day");
//        } else if (whatIsToday.equals("Tuesday")){
//            System.out.println("It is a week day");
//        } else if (whatIsToday.equals("Wednesday")) {
//            System.out.println("It is a week day");
//        } else if (whatIsToday.equals("Thursday")) {
//            System.out.println("It is a week day");
//        } else if (whatIsToday.equals("Friday")) {
//            System.out.println("It is a week day");
//        } else if (whatIsToday.equals("Saturday")) {
//            System.out.println("It is weekend");
//        } else if (whatIsToday.equals("Sunday")) {
//            System.out.println("It is weekend");
//        } else {
//            System.out.println("Invalid input please check the day");
//        }

        if (whatIsToday.equals("Monday") || whatIsToday.equals("Tuesday")
                || whatIsToday.equals("Wednesday") || whatIsToday.equals("Thursday")
                || whatIsToday.equals("Friday")) {
                System.out.println("It is a week day");
                } else if (whatIsToday.equals("Saturday") || whatIsToday.equals("Sunday")) {
            System.out.println("It is weekend");
        } else {
            System.out.println("Invalid input please check the day");
        }
    }
}
