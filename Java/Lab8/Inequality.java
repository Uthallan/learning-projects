public class Inequality {
    public static void main(String[] args) {
        // list of incomes in thousands
        int[] income = {2, 10, 532, 4, 53, 28, 291, 38, 6, 17, 73, 21};
        int sum = 0;
        int average;
        int aboveAverage = 0;
        
        for (int i = 0; i < income.length; i++) {
            sum = sum + income[i];            	            	
            }
        
        
        average = sum/income.length;
        System.out.println(" Average of income array : " + average);
        
        for (int i = 0; i < income.length; i++) {       	
            if (income[i] > average) {
            	System.out.println(income[i]);
            	++aboveAverage;
            }            	            	
            }
        System.out.println(aboveAverage + " elements are above the average");
    }
}