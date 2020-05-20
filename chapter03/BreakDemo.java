/*
	Using break to exit a loop.
	@author Max Wilson
	19 May 2020
*/
class BreakDemo{
	public static void main(String[] args){
		int num = 100;
		
		for (int i = 0; i < 100; i++){
			if(i * i >= 100) break;
			System.out.print(i + " ");
		}
		
		System.out.println("Loop Complete");
	}
}

