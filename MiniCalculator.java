import java.io.*;

public class MiniCalculator{
	public static void main(String[] args){
		System.out.println("Give me a number");
		double number1=0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try{
			number1=Double.parseDouble(in.readLine());
			System.out.println("What would you like to do to this number?");
			String operator = in.readLine();
			System.out.println("What's the other number?");
			double number2 = Double.parseDouble(in.readLine());
			if (operator.equals("+")){
				System.out.println(number1+number2);
			}
			if (operator.equals("-")){
				System.out.println(number1-number2);
			}
			if (operator.equals("*")){
				System.out.println(number1*number2);
			}
			if (operator.equals("/")){
				System.out.println(number1/number2);
			}	
		}
			catch(Exception e){
			System.out.println("Are you fucking stupid?");
		}		
	}
}	