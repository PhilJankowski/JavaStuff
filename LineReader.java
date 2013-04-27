import java.io.*;

public class LineReader{
	public static void main(String[] args){
	System.out.println("Type a line of text please");
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try{
			String text = in.readLine();
			char[] charArray=text.toCharArray();
			boolean newWord=false;
			for (int i=0; i<charArray.length; i++){
				if (newWord && Character.isLetter(charArray[i])){
					System.out.println();
					System.out.print(charArray[i]);
					newWord = false;
				}else if (!newWord && Character.isLetter(charArray[i])){	
					System.out.print(charArray[i]);
					newWord = false;
				}
				if (!newWord && !Character.isLetter(charArray[i])){
					newWord = true;
				}	
			}	
		}
		catch(Exception e){
			System.out.println("URRRURURUR");
		}
	System.out.println();
	}
}