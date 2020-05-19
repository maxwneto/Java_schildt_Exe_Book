/*
	Declare loop control variable inside the for.
	@author: Max Wilson
	18 May 2020
*/
class VarStatement{
	public static void main(String[] args){
		int sum = 0, fact = 1;
		
		// compute the factorial of the number throug 5
		for(int i = 1; i <= 5; i++){
			sum+= i;
			fact*= i;
		}
		
		System.out.println("Sum is  " + sum);
		System.out.println("Factorial is " + fact);
	}
}
