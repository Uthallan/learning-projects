public class Prog9ArrayMethods {

    public static void main(String[] args) {
        // daily low temperatures for Portland Maine Jan 1 - Dec 31 2020
        int[] tmin = {32, 30, 35, 34, 21, 14, 19, 27, 16, 16, 38, 29, 24, 28, 
                30, 23, 3, 3, 16, 7, -4, 8, 15, 22, 36, 35, 33, 31, 19, 
                15, 17, 31, 28, 22, 26, 27, 24, 24, 8, 0, 27, 25, 32, 
                31, 5, -1, 23, 23, 19, 22, 12, 2, 19, 21, 24, 33, 37, 
                31, 27, 19, 16, 18, 32, 36, 29, 25, 26, 25, 38, 37, 36, 
                30, 39, 37, 25, 20, 32, 28, 37, 37, 26, 21, 21, 33, 27, 
                31, 36, 29, 37, 34, 30, 29, 39, 43, 39, 39, 37, 32, 35, 
                33, 35, 31, 31, 45, 44, 32, 29, 31, 30, 27, 32, 28, 31, 
                26, 35, 36, 34, 39, 36, 34, 43, 47, 44, 46, 45, 39, 34, 
                43, 40, 35, 35, 44, 38, 35, 36, 48, 48, 47, 44, 40, 40, 
                46, 50, 43, 37, 40, 52, 53, 62, 46, 60, 43, 37, 42, 53, 
                51, 65, 63, 56, 50, 54, 52, 57, 61, 51, 51, 46, 49, 50, 
                54, 62, 69, 62, 59, 63, 65, 60, 59, 60, 62, 63, 62, 62, 
                61, 62, 60, 63, 61, 58, 66, 65, 67, 68, 71, 67, 64, 60, 
                59, 61, 65, 67, 73, 70, 68, 66, 68, 65, 67, 78, 73, 67, 
                69, 64, 67, 66, 70, 67, 70, 60, 59, 62, 63, 70, 68, 72, 
                69, 64, 60, 59, 62, 61, 56, 52, 58, 62, 59, 66, 66, 53, 
                47, 52, 59, 53, 49, 56, 60, 64, 59, 51, 57, 57, 63, 65, 
                66, 55, 47, 45, 50, 40, 47, 58, 50, 44, 36, 34, 39, 55, 
                51, 55, 56, 57, 65, 63, 58, 52, 43, 40, 39, 42, 48, 53, 
                38, 31, 50, 37, 34, 44, 44, 40, 53, 33, 30, 34, 47, 50, 
                51, 53, 43, 33, 36, 41, 37, 34, 25, 21, 30, 30, 26, 29, 
                30, 51, 49, 43, 41, 36, 53, 37, 33, 29, 24, 39, 28, 17, 
                16, 38, 32, 26, 33, 22, 20, 32, 32, 32, 27, 27, 44, 32, 
                30, 34, 33, 28, 23, 26, 19, 24, 26, 27, 30, 27, 14, 10, 
                12, 15, 3, 15, 20, 27, 19, 21, 47, 28, 22, 21, 17, 16, 
                21};

        // monthStarts[] holds the starting indices in tmin[] for each month in 2020
        // Note in monthStarts[] we are using index 1 for January, 2 for February, ... ,
        //                                                            13 for the month after December
        // The section of tmin[] for each month starts at the index specified in monthStarts[] for
        // that month and continues up to the index for the start of the next month.
        // For example the data for February is stored at indices from 31 up to but not including index 60.
        //                      [1] [2] [3] [4] [5]  [6]  [7]  [8]  [9] [10] [11] [12]
        //                      Jan Feb Mar Apr May  Jun  Jul  Aug  Sep  Oct  Nov  Dec
        int[] monthStarts = {-1, 0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366};
        String[] monthNames = {"","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

        // Calculate the average temperatures for each month.
        double[] monthAverages = new double[12];

        // Testing
        int max = arrayMax(tmin);
        System.out.println("Maximum value: " + max);
        int min = arrayMin(tmin);
        System.out.println("Minimum value: " + min);
        double arrayAverage = arrayAverage(tmin);
        System.out.println("Average value: " + arrayAverage);
        double arraySubAverage = arraySubAverage(tmin, 5, 10);
        System.out.println("Average sub-value: " + arraySubAverage);
        System.out.println("");
        System.out.println("Monthly Averages:");
        for (int i = 1; i<13; i++) {
            monthAverages[i-1] = arraySubAverage(tmin, monthStarts[i], monthStarts[i+1]);
            System.out.println("The average for " + monthNames[i] + " is " + monthAverages[i-1]);
        }
        int[] testCases = {0,10,20,30,40,50,60,70,80,90,100};
        System.out.println("");
        System.out.println("Index of first occurrences test:");
        System.out.print(" ");
        for (int i = 0; i<10;i++) {
            int index = firstInstance(tmin, testCases[i]);
            if (index != -1) {
            System.out.println(testCases[i] + " first appears at index " + index);
            }
            if (index == -1) {
                System.out.println(testCases[i] + " does not appear in the array ");    
            }
        }

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
