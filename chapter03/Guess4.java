/*
	Guess the letter game, 4th version
	@author Max Wilson
	19 May 2020
*/
import java.util.*;
class Guess4{
	public static void main(String[] args) throws java.io.IOException{
		//Scanner in = new Scanner(System.in);
		char ch, ignore, answer = 'K';
		
		do{
			System.out.println("I'm thinking of a letter between A and Z.");
			System.out.print("Can you guess it: ");
			
			ch = (char) System.in.read();
			
			do{
				ignore = (char) System.in.read();
			}while(ignore != '\n');
			
			if (ch == answer) System.out.println("** Right **");
			else{
				System.out.print("...Sorry, you're ");
				if(ch < answer) System.out.println("too low.");
				else System.out.println ("too high.");
			}
		}while (answer != ch);
	}
}
