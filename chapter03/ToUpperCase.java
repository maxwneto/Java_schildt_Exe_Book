/*
	Program to convert UpperCase and  LowerCase
	@author: Max Wilson
	24 May 2020
*/
class ToUpperCase{
	public static void main(String[] args) throws java.io.IOException{
		char in;
		int changes = 0;
		
		System.out.println("Enter period to stop.");
		
		do{
			in = (char) System.in.read();
			if(in >= 'a' & in <= 'z'){
				in -= 32;
				changes++;
				System.out.println(in);			
			}else if(in >= 'A' & in <='Z'){
				in += 32;
				changes++;
				System.out.println(in);			
			}
		}while (in != '.');
		System.out.println("Case changes: " + changes);
		
	}
}
