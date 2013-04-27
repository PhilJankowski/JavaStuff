import java.io.*;

public class PlayingAround {
	public static void main(String [] args){
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 		/*int x=0;
 		int y=0;
 		int z=0;*/
 		try{
			int x = Integer.parseInt(in.readLine());
			int y = Integer.parseInt(in.readLine());
			int z = Integer.parseInt(in.readLine());
			
			if (x<y && x<z){
				if (y<z){
					System.out.printf("%d, %d, %d \n" x, y, z);
				}else {
					System.out.println(x + ", " + z + ", " y);
				}	
			}else if (y<x && y<z){
				if (x<z){ 
					System.out.printf("%d, %d, %d \n" y, x, z);
				}else {
					System.out.println(y + ", " + z + ", " x);
				}			
			}else {
				if (x<y){
					System.out.println(z + ", " + x + ", " y);
				}else { 
					System.out.println(z + ", " + y + ", " x);
				}
			}
		}
		catch(Exception e){
			System.out.println("Are you fucking stupid?");
		}
		
	}
}
