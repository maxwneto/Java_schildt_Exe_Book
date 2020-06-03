package chapter02;
/*
	// Side effects can be important.
	@author Max Wilson
	15 May 2020	
*/
class SideEffects{
	public static void main(String[] args){
		int i = 0;
		
		/*
			Here, i isstill incremented even though
			the if statement fails.
		*/
		if(false & (++i < 100)){
			System.out.println("this won't be displayed");
		}
		System.out.println("if statement executed: " + i);
		
		/*
			In this case, i is not incremented because
			the short-circuit operator skips the increment.
		*/
		if(false && (++i < 100)){
			System.out.println("this won't be displayed");
		}
		System.out.println("if statement executed: " + i);
	}
}
