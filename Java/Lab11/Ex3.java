// lab 11
import java.io.*;
import java.util.*;

public class Ex3 {
    public static void main(String[] args) throws IOException {
        String fileName = "people.txt";
        FileInputStream fileInStream = new FileInputStream(fileName);    
        Scanner fileScnr = new Scanner(fileInStream);
        
        while (fileScnr.hasNext()) {
            String line = fileScnr.nextLine();
            System.out.println("<" + line + ">");
        }
        
        System.out.println();
        fileScnr.close();
    }   
}