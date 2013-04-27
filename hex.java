import java.io.*;
public class hex{
	public static void main(String[] args){
		System.out.println("Give me a hexadecimal digit, and \n I will convert it to a base-10 integer.");
		System.out.print("Enter your number: ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try{
			String hexa = in.readLine();
			int value = 0;
			for (int i = 0; i < hexa.length();  i++ ){
   				value = value*16 + hexValue( hexa.charAt(i) );
   				
			}
			System.out.println(value);
		}
		catch(Exception e){
			System.out.println("I just shit the bed");
		}
	}
	static int hexValue(char c) {
		switch (c){
			case 'A':
				return 10;
			case 'B':
				return 11;
			case 'C':
				return 12;
			case 'D':
				return 13;
			case 'E':
				return 14;
			case 'F':
				return 15;
			default:
				return Integer.parseInt(String.valueOf(c));	
		
		}
	}
}