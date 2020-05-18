/*
	Read a character from the keyboard.
	@author Max Wilson
	18 May 2020
*/
class KbIn{
	public static void main(String[] args)
		throws java.io.IOException{
			char ch;
			
			System.out.print("Press a key followed by Enter: ");
			
			ch = (char) System.in.read();
			
			System.out.println("Your key is: " + ch);
		
	}
}
