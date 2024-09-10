package input;

import java.io.*;
import java.util.Scanner;

public class FileReaderWithScanner {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/Users/silvana.georg_nsp/OneDrive - NS/Java Training/Sections/story.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
