package wrapper;

public class AutoboxingUnboxingDemo {

    public static void main(String[] args) {
        // Autoboxing
        Integer integer = 16; //Integer.valueOf()
        Character character = 'M';
        Boolean boolObj = false;

        // Unboxing
        int num = integer;
        char m = character;
        boolean f = boolObj;

        System.out.println(num);
        System.out.println(m);
        System.out.println(f);

        // null scenario
        Integer nullObj = null;
        int num1 = nullObj; //nullpointer exception
    }
}
