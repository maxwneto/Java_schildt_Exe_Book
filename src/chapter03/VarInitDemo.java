package chapter03;
/*
	Demonstrate lifetime of a variable
	Max Wilson
	14:12 14/05/2020
*/
class VarInitDemo{
	public static void main(String args[]){
		int x;
		
		for (x = 0; x < 3; x++){
			int y = -1;
			System.out.println("y is: " + y);
			
			y = 100;
			System.out.println("y is now: " + y);
		}
	}
}
