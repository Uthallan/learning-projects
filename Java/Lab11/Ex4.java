// lab 11
import java.io.*;
import java.util.*;

public class Ex4 {
    public static void main(String[] args) throws IOException {
        String fileName = "people.txt";
        FileInputStream fileInStream = new FileInputStream(fileName);    
        Scanner fileScnr = new Scanner(fileInStream);
        
        while (fileScnr.hasNext()) {
            int age = fileScnr.nextInt();
            String lastName = fileScnr.next();
            String firstName = fileScnr.nextLine();

            firstName = firstName.substring(1,firstName.length());
            lastName = lastName.substring(0, lastName.length()-1);
            System.out.println(firstName + " " + lastName + " " + age);
        }
        
        System.out.println();
        fileScnr.close();
    }   
}