import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Average{
	public static void main(String []args){
		int sum = 0;
		int count = 0;
		int N = 0;
		System.out.println("Give me an integer");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try{
			N = Integer.parseInt(in.readLine());			
		
			while(N !=0){
				sum = sum + N;
				count++;
				System.out.println("Give me another integer, enter 0 when done.");
				N = Integer.parseInt(in.readLine());	
				}
			if (N==0){
				System.out.println("You indicated you have no more numbers to enter.");		
				double average = ((double)sum)/count;
				System.out.printf("The average is %1.2f\n", average );
			}
		}
		catch(Exception e){
			System.out.println("Are you fucking stupid?");
		}
	}
}