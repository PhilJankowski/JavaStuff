import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InterestCalculator{
	public static void main(String []args){
		double initialInv = 0;
		double interestRate = 0;
		System.out.println("What is your initial investment?");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try{
			initialInv = Double.parseDouble(in.readLine());			
			System.out.println("What is your interest rate?");
			interestRate = Double.parseDouble(in.readLine());
			
			
		}catch(Exception e){
			System.out.println("Are you fucking stupid?");
		}
		int years = 0;
		while(years <5){
			years++;
			double interest;
			interest = initialInv*interestRate;
			initialInv = initialInv+interest;
						
			System.out.printf("Your investment after " +years + " is $%1.2f", initialInv);
			System.out.println();
			
		}
		
	}
}