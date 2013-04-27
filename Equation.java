import java.io.*;
public class Equation{
	public static void main(String[] args){
		int K = 0;
		System.out.println("Enter a parameter for the 3N+1 sequence here:");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try{
			K = Integer.parseInt(in.readLine());
			}
		catch (Exception e){
			System.out.println("A integer, you stupid head");
		}
		printSequence(K);

	}	
	static void printSequence(int startingValue){
		int N = startingValue;
		int count = 0;
		while (N>1){
			if (N%2 == 1){
				N = 3 * N + 1;
			}
			else {
			N = N/2;
			}
			count++;
			System.out.println(N);
		}
		System.out.println();
		System.out.println("There were " + count + " terms in the sequence.");
	}
}