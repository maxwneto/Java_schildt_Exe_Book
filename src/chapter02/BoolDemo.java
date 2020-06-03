package chapter02;

/*
	Demonstrate boolean values.
	Max Wilson
	23:30 13/05/2020
*/
class BoolDemo{
	public static void main(String[] args){
		boolean b;
		
		b = false;
		System.out.println("b is " + b);
		
		b = true;
		System.out.println("b is " + b);
		
		// a boolean value can control the if statement
		if(b){
			System.out.println("This is executed.");
		}
		
		// outcome of a relational operator is a boolean value
		System.out.println("10 > 9 is " + (10 > 9));		
	}
}
