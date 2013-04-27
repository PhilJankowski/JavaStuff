import java.io.*;

public class Measurements{
	public static void main(String[] args){
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Whats is the measurement? Enter 0 when you're done.");
			double measurement=Double.parseDouble(in.readLine());
			while (measurement != 0.0) {
				System.out.println("What unit of measurement?");
				String unit = in.readLine();
				double inches=0, feet=0, yards=0, miles=0;
				if (unit.equals("inches") || unit.equals("inch") || unit.equals("in")){
					inches = measurement;
				} else if (unit.equals("foot") || unit.equals("feet") || unit.equals ("ft")){
					inches = measurement*12;
				} else if (unit.equals("yard") || unit.equals("yards") || unit.equals ("yd")){
					inches = measurement*36;
				} else if (unit.equals("mile") || unit.equals("miles") || unit.equals ("mi")){
					inches = measurement*12*5280;
				}
				else {
					System.out.println("Please try again with units.");
					continue;
				}
				feet = inches/12;
				yards = inches/36;
				miles = inches / (12*5280);
				System.out.printf("That's equivalent to %12.5f \n", inches);
				System.out.printf("That's equivalent to %12.5f \n", feet);
				System.out.printf("That's equivalent to %12.5f \n", yards);
				System.out.printf("That's equivalent to %12.5f \n", miles);
				System.out.println("Whats is the measurement? Enter 0 when you're done.");
				measurement=Double.parseDouble(in.readLine());
			}
		}
		catch(Exception e){
			System.out.println("I need a number you dumbass?");
		}	
	}
}