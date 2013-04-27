import java.io.*;

public class TestData{
	public static void main(String [] args){
		try{
			BufferedReader br = new BufferedReader(new FileReader(new File("TestData.txt")));
			String name = br.readLine();
			System.out.println(name);
			double test1 = Double.parseDouble(br.readLine());
			System.out.println(test1);
			double test2 = Double.parseDouble(br.readLine());
			System.out.println(test2);
			double test3 = Double.parseDouble(br.readLine());
			System.out.println(test3);
			
			System.out.println((test1+test2+test3)/3);
			System.out.printf("The average grade for %s was %1.1f", name, ((test1+test2+test3)/3));
       		System.out.println();

		}catch(Exception e){}
	}
}