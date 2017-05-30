import java.util.Scanner;
import java.util.Random;

public class Magic8 {

	public static void main(String[] args) {
		
		String question; 
		String [] answer = { "It is certain", "It is decidedly so", "Without a doubt", " Yes definitely", "You may rely on it", "As I see it, yes", "Most likely", "Outlook good", "Yes", "Signs point to yes", "",
				"You may rely on it", " As I see it, yes", "Most likely", " Outlook good", " Signs point to yes", "Reply hazy try again", "Ask again later", "Better not tell you now", "Cannot predict now", " Concentrate and ask again", 
				"Reply hazy try again", " Ask again later", "Better not tell you now", "Cannot predict now", "Concentrate and ask again", " Don't count on it", " My reply is no", " My sources say no", " Outlook not so good", "Very doubtful"};
		
		String again= "yes";
		

		Random rn = new Random (); 
		Scanner keyboard = new Scanner (System.in); 
		
		int i = rn.nextInt(answer.length);
		
		while(again.equals("yes")){
			
		System.out.println("Ask me something.");  
		question = keyboard.nextLine(); 
		
		System.out.println("You asked " + question); 
		System.out.println("MAGIC 8-BALL SAYS: " + answer[i]);
		
		System.out.println("Do you have another question for the Magic 8-Ball? (y/n)");
		again = keyboard.nextLine(); 
		
		}
		
	}

}
