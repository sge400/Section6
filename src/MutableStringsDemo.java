import java.io.CharArrayWriter;
import java.io.IOException;

public class MutableStringsDemo {

    public static void main(String[] args) throws IOException {

        //Approach 1
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("World");
        stringBuilder.insert(0, "Hello ");
        stringBuilder.deleteCharAt(4);
        stringBuilder.insert(4, 'o');
        stringBuilder.setLength(5);
        stringBuilder.reverse();
        String str = stringBuilder.toString();

        //Approach 2
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("World");
        stringBuffer.insert(0, "Hello ");
        stringBuffer.deleteCharAt(4);
        stringBuffer.insert(4, 'o');
        stringBuffer.setLength(5);
        stringBuffer.reverse();
        String str1 = stringBuffer.toString();

        //Approach3
        CharArrayWriter cw = new CharArrayWriter();
        cw.write("Hello");
        cw.write(" World");
        String str3 = cw.toString();



    }
}
