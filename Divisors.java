import java.io.*;

public class Divisors{
	public static void main(String []args){
		System.out.println("What number do you want to know bout?");	
		int N = 0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try{
			N = Integer.parseInt(in.readLine());			
			
		}catch(Exception e){
			System.out.println("Are you fucking stupid?");
		}
		int D;
		int E = 0;
		for (D=1; D <= N; D++){
			if (N%D==0)
				E++;			
				System.out.println(D);
					
		}
		System.out.print(N);
		System.out.println(" has " + E + " factors.");
	}
}