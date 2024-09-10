package input;

import java.io.*;
import java.util.Scanner;

public class FileReaderWithScanner {
    //why is it not working?!!

    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/silvana.georg_nsp/OneDrive - NS/Java Training/Sections/story.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
