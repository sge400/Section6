public class LengthMethodDemo {

    public static void main(String[] args) {
        //length method is an instance method, so only call it on an object
        String str1 = "Hello";
        String str2 = "World";
        String combined = str1 + " " + str2;

        int length1 = str1.length();
        int length2 = str2.length();
        int length3 = combined.length();

        String emptyString = "";
        int emptyLength = "".length();
        int length4= "Hello".length();
    }
}
