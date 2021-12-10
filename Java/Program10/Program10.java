import java.io.*;
import java.util.*;

public class Program10 {

    public static void main(String[] args) throws IOException {
        String fileName = "PortlandWeather1941to2020.txt";
        FileInputStream fileInStream = new FileInputStream(fileName); 
        Scanner fileScnr = new Scanner(fileInStream);

        int numRecords = Integer.parseInt(fileScnr.next());
        
        // run scanner 3 times to skip over headers in file
        fileScnr.nextLine();
        fileScnr.nextLine();
        fileScnr.nextLine();
        fileScnr.useDelimiter("[/ \t\n\r]+");

        // Part 1: initialize arrays
        int[] month = new int[numRecords];
        int[] day = new int[numRecords];
        int[] year = new int[numRecords];
        int[] tmax = new int[numRecords];
        int[] tmin = new int[numRecords];

    
        // Part 2: Fill arrays
        int count = 0;
        while (fileScnr.hasNext()) { //
            month[count] = fileScnr.nextInt();
            day[count] = fileScnr.nextInt();
            year[count] = fileScnr.nextInt();
            tmax[count] = fileScnr.nextInt();
            tmin[count] = fileScnr.nextInt();
            count++;
        }

        // Part 3: Print averages
        int tmaxDateHighest = firstInstance(tmax, arrayMax(tmax));
        int tminDateLowest = firstInstance(tmin, arrayMin(tmin));
        System.out.println("tmaxDateHighest = " + month[tmaxDateHighest] + "/" + day[tmaxDateHighest] + "/" + year[tmaxDateHighest]);
        System.out.println("tminDateLowest = " + month[tminDateLowest] + "/" + day[tminDateLowest] + "/" + year[tminDateLowest]);
        System.out.println("tmaxAverage = " + arrayAverage(tmax));
        System.out.println("tminAverage = " + arrayAverage(tmin));
        int firstYear =  + year[0];
        int lastYear =  + year[year.length-1];
        System.out.println(lastYear);
        System.out.println(firstYear);
        System.out.println();

        // Part 4: Make loop that prints year start indexes
        //         and stores them in an array
        int[] yearIndex = new int[lastYear - firstYear+1];
        count = 0;
        System.out.println("Year  Starting Index");
        for (int yeari = firstYear; yeari <= lastYear; yeari++) {
            yearIndex[count] = firstInstance(year, yeari);
            System.out.println(yeari + " " + yearIndex[count]);
            count++;                     
        }
        System.out.println();

        // Part 5 test
        //System.out.println(firstFallFrost(tmin, 0, 365));
        //System.out.println(firstFallFrost(tmin, 365, 730));

        // Part 6: table of the first fall frost dates
        int[] frostMonths = new int[yearIndex.length];
        int[] frostDays = new int[yearIndex.length];
        System.out.println("Year  first Fall Frost");
        for (int i = 0; i < yearIndex.length; i++) {
            int frostIndex = firstFallFrost(tmin, yearIndex[i], yearIndex[i]+365);
            System.out.println(year[yearIndex[i]] + "  " + month[frostIndex] + "/" + day[frostIndex]);
            frostDays[i] = day[frostIndex];
            frostMonths[i] = month[frostIndex];
        }
        System.out.println();

        System.out.println("- Analysis -");
        System.out.println("Average frostfall in first decade");
            int daySum = 0;
            int monthSum = 0;
        for (int i = 0; i < 10; i++) {
            daySum = daySum + frostDays[i];
            monthSum = monthSum + frostMonths[i];
            //System.out.println(frostMonths[i] + "/" + frostDays[i]);
            
        }
        System.out.println((monthSum/10) + "/" + (daySum/10));
        
        System.out.println("Average frostfall in last decade");
        daySum = 0;
        monthSum = 0;
        for (int i = frostDays.length-10; i < frostDays.length; i++) {
            daySum = daySum + frostDays[i];
            monthSum = monthSum + frostMonths[i];
            //System.out.println(frostMonths[i] + "/" + frostDays[i]);
            
        }
        System.out.println((monthSum/10) + "/" + (daySum/10));
        System.out.println("Average frost fall is almost a whole month later on average every year!");



        fileScnr.close();
    }

    // Part 5: First fall frost, assumed to mean first instance of >32 degrees
    public static int firstFallFrost(int[] tmin, int yearStartIndex, int yearEndIndex) {
        int frostIndex = 0;
        double midYear = (yearStartIndex + yearEndIndex)/2.00;
        for (int i = (int)midYear; i < yearEndIndex; i++) {
            if (tmin[i] <= 32) {
                frostIndex = i;
                break;
            }
        }
        return frostIndex;

    }

    // return the maximum value in the array
    public static int arrayMax(int[] a) {
        int max = a[0];

        for (int i = 1; i < a.length; i++)  // compare the rest
            if (a[i] > max)
                max = a[i];

        return max; 
    }
    public static int arrayMin(int[] a) {
        int min = a[0];

        for (int i = 1; i < a.length; i++)  // compare the rest
            if (a[i] < min)
                min = a[i];

        return min; 
    }       
    public static double arrayAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i<array.length;i++) 
            sum = sum + array[i];
        return sum / array.length;
    }
    public static double arraySubAverage(int[] array, int starti, int endi) {
        double sum = 0;
        double subi = 0;
        for (int i = starti; i<endi;i++) {
            sum = sum + array[i];
            subi++;
        }
        return sum / subi;
    }
    public static int firstInstance(int[] array, int value) {
        int instance = -1;
        for (int i = 0; i<array.length;i++) {
                if (value == array[i]) {
                    instance = i;
                    break;
                }
        }
        return instance;
    }
}