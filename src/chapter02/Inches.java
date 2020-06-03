package chapter02;
/*
	Compute the number of cubic inches
	in 1 cubic mile.
	Max Wilson
	22:25 13/05/2020
*/
class Inches{
	public static void main(String[] args){
		long ci;
		long im;
		
		im = 5280 * 12;
		
		ci = im * im * im;
		
		System.out.println("There are " + ci + 
		" cubic inches in cubic mile.");
	}
}	
