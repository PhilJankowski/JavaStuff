import java.io.*;

public class printCapitalized{
	public static void main(String[] args){
		System.out.println("Give me a sentence");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try{
			String sentence = in.readLine();
			String capitalizedSentence = printCapitalized(sentence);
			System.out.println(capitalizedSentence);
		}
		catch(Exception e){
			System.out.println("I just shat myself: \n" + e.getMessage() + "\n\n" + e.toString());
		}
	}
	public static String printCapitalized(String source){
		String destination = "";
		char[] letters=source.toCharArray();
		int lettersArray=0;
		for(lettersArray=0; lettersArray<source.length(); lettersArray++){
			if (lettersArray==0){
				destination=destination.concat(String.valueOf(Character.toUpperCase(letters[lettersArray])));
			}
			else if(!Character.isLetter(letters[lettersArray-1])){
				destination=destination.concat(String.valueOf(Character.toUpperCase(letters[lettersArray])));
			}else {
				destination=destination.concat(String.valueOf(letters[lettersArray]));
			}
		}	
		return destination;
		
	}
}