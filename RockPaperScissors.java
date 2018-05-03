import java.util.*;
import java.io.*;

public class RockPaperScissors {
	
	public static void main(String[] args)
	{
		System.out.println(play());
	}
	
	private static String randomOutput(String[] array ) 
	{
		int index = new Random().nextInt(array.length);
		String result = array[index];
		
		return result;
		
	}
	
	private static String play() 
	{
		String[] choices = new String [] {"rock", "paper", "scissors"};
		Scanner consoleReader = new Scanner(System.in);
		System.out.println("Rock, paper, or scissors?");
		String choice = consoleReader.nextLine().toLowerCase();
		String computerChoice = randomOutput(choices);
		
		if(computerChoice.equals("rock")) {
			if(choice.equals("rock")) 
			{
				return "The computer got rock, you tied!";
			} else if(choice.equals("paper")) 
			{
				return "The computer got rock, you win!";
			} else if(choice.equals("scissors")) 
			{
			return "The computer got rock, you lose!";

			}
		} else if(computerChoice.equals("paper")) {
			
			if(choice.equals("rock")) 
			{
				return "The computer got paper, you lose!";
			} else if(choice.equals("paper")) 
			{
				return "The computer got paper, you tied!";

			} else if(choice.equals("scissors")) 
			{
				return "The computer got paper, you win!";

			}
		}
			
		else if (computerChoice.equals("scissors")) {
			if(choice.equals("rock")) 
			{
				return "The computer got scissors, you win!";
			} else if(choice.equals("paper")) 
			{
				return "The computer got scissors, you lose!";

			} else if(choice.equals("scissors")) 
			{
				return "The computer got scissors, you tied!";

			}
		}
		return "";
	}
}
