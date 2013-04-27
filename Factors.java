import java.io.*;

public class Factors{
	public static void main(String[] args){
		int number = 0;
		
		System.out.println("Give me a number, I'll tell you how many factors it has.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			number = Integer.parseInt(br.readLine());
		}
		catch (Exception e){
			System.out.println("You are really dumb, for real");
		}
		int answer = divisors(number);
		System.out.printf("%d has %d factors", number, answer);
	
	}

	public static int divisors(int N){
		int I = 1;
		int countDivisors = 0;
		for (I = 1; I <= N; I++){
			if (N%I==0) {
				countDivisors++;
				System.out.println(I);	 
			}
		}
		return countDivisors;		
	}
}