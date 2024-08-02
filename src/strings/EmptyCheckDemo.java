package strings;

public class EmptyCheckDemo {

    public static void main(String[] args) {
        String myString = "";
        boolean isEmpty = myString.isEmpty();
        boolean isLengthZero = myString.length() == 0;
        boolean isEqualEmpty = "".equals(myString);

        String nullString = null;
        boolean isNullEmpty = "".equals(nullString);
        //boolean isEmptyNull = nullString.isEmpty();
        //boolean isEmptyLength = nullString.length() == 0;
        String blankString = "     "; //not empty, has whitespace
        boolean isBlankEmpty = blankString.isEmpty();
        boolean isBlank = blankString.isBlank();
    }
}
