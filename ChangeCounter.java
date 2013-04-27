import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ChangeCounter{
	public static void main(String[] args) {
		int quarters;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("How many quarters do you have?");
			quarters = Integer.parseInt(in.readLine());
			System.out.println("How many dimes do you have?");
			dimes = Integer.parseInt(in.readLine());
			System.out.println("How many nickels do you have?");
			nickels = Integer.parseInt(in.readLine());
			System.out.println("How many pennies do you have?");
			pennies = Integer.parseInt(in.readLine());
		}catch(IOException e){}
		
		System.out.println("You have $" + (quarters*.25 + dimes*.10 + nickels*.05 + pennies*.01));
		}
}
