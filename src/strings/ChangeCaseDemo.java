package strings;

import java.util.Locale;

public class ChangeCaseDemo {

    public static void main(String[] args) {
        String originalString = "Java";
        String upperCaseString = originalString.toUpperCase(Locale.GERMAN);
        String lowerCaseString = originalString.toLowerCase();

        String specialString = "Java1@Best";
        String specialUpperCaseString = specialString.toUpperCase();
        String specialLowerCaseString = specialString.toLowerCase();
    }
}
