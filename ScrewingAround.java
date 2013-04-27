import java.io.*;
public class ScrewingAround{
	public static void main(String[] args){
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Give me an integer 1 through 10 and don't mess around");
		//int number = 0;
		try{
			int number = Integer.parseInt(in.readLine());
			switch (number){
				case 1:
					System.out.println("The number is 1");
					break;
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
					System.out.println("The number is 2 through 9");
					break;
				case 10:
					System.out.println("The number is 10");
					break;
			}
		}
		catch(Exception e){
			System.out.println("I SAID A NUMBER 1-10 FUCKFACE");
		}	
	}
}