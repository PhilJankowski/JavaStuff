import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EggCounter {

	public static void main(String [] args){
		int eggs = 0;
		System.out.println("How many eggs do you have?");	
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try{
			eggs = Integer.parseInt(in.readLine());
			System.out.println("You have " +eggs+", which is "+ eggs/144 +" gross eggs, with " + (eggs%144)/12 + " dozen and " + eggs%144%12 + " left over."); 
		}catch(Exception e){
			System.out.println("Shit blew up");
		}
	}
}