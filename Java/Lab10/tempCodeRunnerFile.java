public class Inequality {
    public static void main(String[] args) {
        // list of incomes in thousands
        int[] income = {2, 10, 532, 4, 53, 28, 291, 38, 6, 17, 73, 21};
        int average = arrayAverage(income);
        System.out.println(" Average of income array : " + average);

    }

    public static int arrayAverage(int[] income) {
        int sum = 0;
        for (int i = 0; i < income.length; i++) {
            sum = sum + income[i];
        }
        int average = sum/income.length;
        return average;
    }
}