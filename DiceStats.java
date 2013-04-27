

import java.io.*;

public class DiceStats{
	public static void main(String[] args){
		System.out.println("This will calculate how many rolles it takes to get snake eyes");
		int snakeEyes = countRollsToGet(2);
		System.out.printf("It took %d rolls \n", snakeEyes);
	}
	public static int countRollsToGet(int goal){
		if (goal < 2 || goal > 12){
			throw new IllegalArgumentException();
		}	
		int totalRolls = 0;
		int sum = 0;
		int die1 = 0;
		int die2 = 0;

		while (sum!=goal){
			totalRolls++;
			die1 = (int)(Math.random()*6+1);
			die2 = (int)(Math.random()*6+1);
			sum = die1 + die2;
		//	System.out.printf("%d, %d\n", die1, die2);	
		}	

		// while(((int)(Math.random()*6+1)+(int)(Math.random()*6+1))!=goal){
// 			totalRolls++;
// 		}
		return totalRolls;
	}
}