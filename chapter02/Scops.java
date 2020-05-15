/*
	Demonstrate the short-circuit operators.
	@author Max Wilson
	15 May 2020
*/
class Scops{
	public static void main(String[] args){
		int n,d,q;
		
		n = 10;
		d = 2;
		
		if(d != 0 && (n % 0) == 0){
			System.out.println(d + " is a factor of " + n);			
		}
		
		/*
			Now, try same thing without short-circuit operator.
			This will cause a divide-by-zero error.
		*/ 
		if(d != 0 & (n % 0) == 0){
			System.out.println(d + " is a factor of " + n);
		}
	}
}
