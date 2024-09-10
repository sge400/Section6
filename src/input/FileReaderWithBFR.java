package input;

import java.io.*;

public class FileReaderWithBFR {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:/Users/silvana.georg_nsp/OneDrive - NS/Java Training/Sections/story.txt");
        BufferedReader reader = new BufferedReader(fileReader);
        String line;

        while((line = reader.readLine())!= null) {
            System.out.println(line);
        }
        reader.close();
    }
}
