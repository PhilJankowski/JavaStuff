import java.io.BufferedReader;
import java.io.InputStreamReader;
public class PrintSquare {
    public static void main(String[] args) {
 		long number;
 		long square;
 		
 		System.out.println("What number you thinkin' of?");
 		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 			try{
 				number = Integer.parseInt(in.readLine());
 				square = number*number;
 				System.out.printf("It's square is %d \n", square);
 				
 			}catch(Exception e){} 
 	}
 }