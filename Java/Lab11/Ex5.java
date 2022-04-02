// lab 11
import java.io.*;
import java.util.*;

public class Ex5 {
    public static void main(String[] args) throws IOException {
        String fileName = "people.txt";
        FileInputStream fileInStream = new FileInputStream(fileName);    
        Scanner fileScnr = new Scanner(fileInStream);
        
        int count = 0;
        int ageSum = 0;
        while (fileScnr.hasNext()) {
            int age = fileScnr.nextInt();
            String lastName = fileScnr.next();
            String firstName = fileScnr.nextLine();

            firstName = firstName.substring(1,firstName.length());
            lastName = lastName.substring(0, lastName.length()-1);
            System.out.println((count+1)+ ". " + firstName + " " + lastName + " " + age);
            count++;
            ageSum = ageSum + age;
        }
        System.out.println();
        System.out.println("Average age is " + (ageSum/count));
        fileScnr.close();
    }   
}