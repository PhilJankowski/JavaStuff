

public class AverageRolls{
	public static void main(String[] args){
		System.out.println("Total On Dice     Average Number of Rolls");
		System.out.println("-------------     -----------------------");
		
		int N = 0;
		for (N = 2; N <= 12; N++){
			double answer = diceAverage(N);
			System.out.printf("       %d                %f\n", N, answer);
		}
	}	
	public static double diceAverage(int average10k){
		int N = 0;
		int rollTotal = 0;
		double average = 0;
		for (N = 1; N <= 10000; N++){
			int goalRoll = DiceStats.countRollsToGet(average10k);
			rollTotal = goalRoll + rollTotal;
		}
		average = ((double)rollTotal)/10000;
	return average;
	}
}