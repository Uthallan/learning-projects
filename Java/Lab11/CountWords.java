// lab 11
import java.io.*;
import java.util.*;

public class CountWords {
    public static void main(String[] args) throws IOException {
        String fileName = "people.txt";
        FileInputStream fileInStream = new FileInputStream(fileName);    
        Scanner fileScnr = new Scanner(fileInStream);

        int count = 0;
        while (fileScnr.hasNext()) {
           // String word = fileScnr.next();
            count++;
        }
        
        System.out.println("The file " + fileName + " has " + count + " words.");

        fileScnr.close();
    }
    
}