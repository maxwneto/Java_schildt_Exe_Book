/*
	Program to cont qt space
	@author: Max Wilson
	23 May 2020
*/
class CountSpace{
	public static void main(String[] args)
	throws java.io.IOException{
		char input,ignore;
		int qtd = 0;
		
		for (int i = 0; i < 10; i++){
			System.out.print("Type a char: ");
			input = (char) System.in.read();
			do{
				ignore = (char) System.in.read();
			}while (ignore != '\n');
			
			if(input < 'a') qtd++;
			
		}
		
		System.out.println("Space inputed " + qtd + " times");
	}
	
}
