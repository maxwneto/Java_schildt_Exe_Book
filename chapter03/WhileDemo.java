/*
	Demonstrate the while loop
	@author: Max Wilson
	18 May 2020
*/
class WhileDemo{
	public static void main(String[] args){
		char ch = 'a';
		
		System.out.println();
		while (ch <= 'z'){
			System.out.print(ch + "_");
			ch++;
		}
		System.out.println("\n");
	}
}
