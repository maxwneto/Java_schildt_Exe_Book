/*
	if else ladder
	@author: Max Wilson
	23 May 2020
*/
class IfElseLadder{
	public static void main(String[] args)
	throws java.io.IOException{
		char input,ignore;
		
		System.out.print("Type a char: ");
		input = (char) System.in.read();
		do{
			ignore = (char) System.in.read();
		}while (ignore != '\n');
		
		if(input == 'M'){
		System.out.println("Congrats. You are Right!");
		}else if (input < 'M'){
			System.out.println("Sorry. Guess to low...");
		}else System.out.println("Sorry. Guess to high...");
	}
}
