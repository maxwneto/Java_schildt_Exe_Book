/*
	Guess the letter game, 3rd version.
	@author: Max Wilson
	18 May 2020
*/
class Guess3{
	public static void main(String[] args)
	throws java.io.IOException{
		char ch, answer = 'K';
		
		System.out.print("I'm thinking of a letter bewteen A and Z.\n"
		+ "Can you guess it: ");
		
		ch = (char) System.in.read();
		
		if(ch == answer){
			System.out.println("** Right **");
		}else{
			System.out.print("...Sorry, you're ");
			if(ch < answer) System.out.println("too low");
			else System.out.println("too high");
		}
	}
}
