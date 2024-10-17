package strings;

public class ConcatMethodDemo {

    public static void main(String[] args) {
        String hello = "Hello";
        hello = hello + " " + "World";
        System.out.println(hello);

        String hello1 = "Hello";
        hello1 = hello1.concat(" ").concat("World");
        System.out.println(hello1);

        String emptyString = "";
        String nullString = null; //not the same as an empty string

        /*int one = 1;
        int two = 2;
        int three = 3;
        String hello = "hello";
        System.out.println(one + two);
        System.out.println(one + two + three);
        System.out.println(one + (two + three));
        System.out.println(hello + one + two);
        System.out.println(hello + one + two + three);
        System.out.println(one + two + hello);
        System.out.println("" + one + two + hello);
        hello.strip();
        hello.trim();*/
    }
}
