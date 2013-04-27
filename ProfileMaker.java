import java.io.*;

public class ProfileMaker{
	public static void main(String[] args){
		try {
			System.out.println("What is your name?");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String name = in.readLine();
			PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
			out.printf("your name is %s", name);
			out.close();
			
			String age = in.readLine();
			
			}catch (Exception e){
				e.printStackTrace();
			}
			//BufferedWriter bw = new BufferedWriter(new FileWriter("profile.txt"));
			//bw.write("Name:            " + name + "\n");
			//bw.close();
			
			
	}
}