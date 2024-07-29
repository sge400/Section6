public class InternMethodDemo {

    public static void main(String[] args) {
        String hello = "hello";
        String obj = new String("hello").intern();
        System.out.println(hello == obj);

        String s1 = "hello";
        String s2 = new String("hello");
        System.out.println(s1 == s2);
        String s3 = s2.intern();
        System.out.println(s1 ==s3);


    }
}
