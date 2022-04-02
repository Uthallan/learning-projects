// lab 11
import java.io.*;
import java.util.*;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        String fileName = "people.txt";
        FileInputStream fileInStream = new FileInputStream(fileName);    
        Scanner fileScnr = new Scanner(fileInStream);
        
        while (fileScnr.hasNext()) {
            
            if (fileScnr.hasNextInt() == true) {
                String word = fileScnr.next();
                System.out.print("(" + word + ")");
            }
            else {
                String word = fileScnr.next();
                System.out.print("[" + word + "]");
            }
        }
        
        System.out.println();
        fileScnr.close();
    }   
}