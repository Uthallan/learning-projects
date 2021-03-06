import java.util.Random;
//import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {

		int numFlips = 1000; // Initialized At Test Value
		int coin = 0;		
		int[] flipRuns = new int[50];	
		int i = 0;
		Random rand = new Random();		
		
		System.out.println("Welcome to the coin flip analyzer.");
		System.out.println("How many flips? ");
		
		//Scanner scnr = new Scanner(System.in);
		
		//numFlips = scnr.nextInt();
		//scnr.close();
			
		// Flip Coin
		int lastFlip = 0;
		int counter = 0;
		for (i=0;i < numFlips; i++) {
			coin = rand.nextInt(2);
			//-----------------------------------------------
			// first Flip
			if (i == 0) {
				lastFlip = coin;
				if (coin == 0) {
					System.out.print("H");
				}
				else {
					System.out.print("T");
				}				
			}
			//---------------------------------------------
			// If flip is not first or past 50
			if (i <= 50 && i != 0) {
				if (coin != lastFlip) {
					//System.out.print(counter);
					System.out.print(" ");
					flipRuns[counter]++;
					flipRuns[0]++;
					counter = 0;					
				}
				if (coin == 0) {
					System.out.print("H");
				}
				else {
					System.out.print("T");
				}		
			}
			//------------------------------------------------
			// If flip is over 50
			if (i > 50 && i != numFlips) {
				if (coin != lastFlip) {					
					flipRuns[counter]++;
					flipRuns[0]++;
					counter = 0;					
				}						
			}
			counter++;
			lastFlip = coin;
		}
		System.out.println("...");
	
		int flipRunsMax = 0;		
		for (i=1;i < flipRuns.length; i++) {
			
			if (flipRuns[i] != 0) {
				flipRunsMax = i;
			}
		}		
		System.out.println("[run length] = frequency (percent)");

		for (i=1;i < flipRunsMax+1; i++) {
			double percentRuns = 0;
			double allRuns = flipRuns[0];
			double thisRun = flipRuns[i];
			percentRuns = (thisRun/allRuns) * 100;
			System.out.println(
					"[" + i + "]" + " = " + flipRuns[i] + 
					" (" + (String.format("%.1f",percentRuns))  + "%)"
							);
		}
	}
}
