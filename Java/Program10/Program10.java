import java.io.*;
import java.util.*;

public class Program10 {

    public static void main(String[] args) throws IOException {
        String fileName = "PortlandWeather1941to2020.txt";
        int[] month = new int[12];

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