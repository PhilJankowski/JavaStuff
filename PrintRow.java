import java.io.*;
public class PrintRow{
	public static void main(String[] args){
		String inputString = "";
		System.out.print("What would u like crazified:  ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			inputString = br.readLine();
		}
		catch (Exception e){
			System.out.println("I shit the bed.");
		}		
		printRowString(inputString);
		
	}
	static void printChar(char ch, int N){
		int i;
		for (i=1; i<=N; i++){
			System.out.print(ch);
		}
		System.out.println();
	}
	static void printRowString(String str){
		int i;
		for (i=0; i<str.length(); i++){
			printChar(str.charAt(i), 25);
		}	
	}
} 