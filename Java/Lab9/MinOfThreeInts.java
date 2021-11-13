import java.util.Scanner;

public class MinOfThreeInts 
{
    public static void main(String[] args) 
    {
        Boolean goodInt;
        int value1, value2, value3;
        int parsedValue = 0;
        Scanner scnr = new Scanner(System.in);
 
        // Let's provide a good Introduction 
        System.out.println("This program determines the minimum of three intgers.");
        System.out.println("It gracefully reports errors when erroneous data is entered ");
        System.out.println("For example, if you type in 'abc' when this program asked for a value,");
        System.out.println("the program will report the error and ask you to try again.");
        System.out.println("Try giving it bad input!\n\n");

        // Get the first integer
        System.out.print("Please enter an integer value ");
        String input = scnr.nextLine();
        goodInt = false;
        while (!goodInt)
        {
            try
            {
                parsedValue = Integer.parseInt(input);
                goodInt = true;
            }
            catch(NumberFormatException ex)
            {
                System.out.print("    Invalid input, please enter an integer ");
                input = scnr.nextLine();
            }
        }
        value1 = parsedValue;

        // Get the second integer
        System.out.print("Please enter an integer value ");
        input = scnr.nextLine();
        goodInt = false;
        while (!goodInt)
        {
            try
            {
                parsedValue = Integer.parseInt(input);
                goodInt = true;
            }
            catch(NumberFormatException ex)
            {
                System.out.print("      Invalid input, please enter an integer ");
                input = scnr.nextLine();
            }
        }
        value2 = parsedValue;

        // Get the third integer
        System.out.print("Please enter an integer value ");
        input = scnr.nextLine();
        goodInt = false;
        while (!goodInt)
        {
            try
            {
                parsedValue = Integer.parseInt(input);
                goodInt = true;
            }
            catch(NumberFormatException ex)
            {
                System.out.print("     Invalid input, please enter an integer ");
                input = scnr.nextLine();
            }
        }
        value3 = parsedValue;

        // Now calculate the minimum
        int min = value1;
        if (value2 < min)
        {
            min = value2;
        }
        if (value3 < min)
        {
            min = value3;
        }

        // Now report the results
        System.out.println("The minimum value of the three integers is " + min);
        scnr.close();
    }
    
}