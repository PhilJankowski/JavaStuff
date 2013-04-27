import java.io.*;
import java.util.*;

public class MiniCalculator2{
	public static void main(String[] args){
		System.out.println("Enter a mathematical problem:");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		double number1=0;
		double number2=0;
		String operator;
		try{
			String problem = in.readLine();
			StringTokenizer st = new StringTokenizer(problem);
			number1 = Double.parseDouble(st.nextToken());
			operator = st.nextToken();
			number2 = Double.parseDouble(st.nextToken());
			double answer=0;
			if (operator.equals("+")){
				answer = (number1+number2);
			}
			if (operator.equals("-")){
				answer = (number1-number2);
			}
			if (operator.equals("*")){
				answer = (number1*number2);
			}
			if (operator.equals("/")){
				answer = (number1/number2);
			}	
			System.out.printf("Your answer is %12.5f \n", answer);
		}
		catch(Exception e){
			System.out.println("DOES NOT COMPUTE");
		}	
	}
}	