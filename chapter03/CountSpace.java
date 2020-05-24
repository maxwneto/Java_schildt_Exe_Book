/*
	Program to cont qt space
	@author: Max Wilson
	23 May 2020
*/
class CountSpace{
	public static void main(String[] args)
	throws java.io.IOException{
		char input;
		int spaces = 0;
		
		System.out.println("Enter a period to stop.");
		do{
			input = (char) System.in.read();
			if(input == ' ') spaces++;
		}while(input != '.');
		
		System.out.println("Spaces: " + spaces);
	}
	
}
