import java.io.*;

public class GuessingGame{
	public static void main(String[] args){
		boolean playAgain = true;
		do {
			playGame();
			System.out.println("True or False? You would like to play again");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try{
				String tryAgain = br.readLine();
				playAgain = Boolean.parseBoolean(tryAgain);
				//while (playAgain) {}	
			}
			catch (Exception e){
			System.out.println("You did that wrong");
			playAgain = false;
			}
		} while (playAgain);
		System.out.println("Thanks for playing. Goodbye");
	}
	static void playGame() {
		System.out.println("Pick a number 1-100 and try to match the computer!");
		int correct = (int)(Math.random()*100 +1);
		int games = 0;
		int guess = 0;
		while (true){
			games ++;
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			if (games == 7){
					System.out.println("TOO MANY GUESSES YOU LOSE, YOU LOSER!");
					break;
			}
			else {
				try{
					guess = Integer.parseInt(in.readLine());	
					if (correct == guess){
						System.out.println("You got it!");
						break;
					} 
					else if (guess > correct){ 
						System.out.println("Nope! Your guess was too high.");
					}
					else if (guess < correct){ 
						System.out.println("Nope! Your guess was too low.");
					}
				}
				catch (Exception e){
				System.out.println("BZZZZZZZZT");
				}
			}
		}
	}
}