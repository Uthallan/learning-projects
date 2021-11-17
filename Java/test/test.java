import java.util.Scanner;

public class test 
{
    public static void main(String[] args) 
    {
        Scanner scnr = new Scanner(System.in);
        System.out.print("dang");


        // Get the first integer
        System.out.print("Please enter an integer value ");
        String input = scnr.nextLine();
        goodInt = false;
        while (!goodInt)
        {
            try
            {
                parsedValue1 = Integer.parseInt(input);
                goodInt = true;
            }
            catch(NumberFormatException ex1)
            {
                System.out.print("    Invalid input, please enter an integer ");
                input = scnr.nextLine();
            }
        scnr.close();
    }
}