/*
	Count 1000 to 0 decrementing by -2
	@author: Max Wilson
	24 May 2020
*/
class Dec1000{
	public static void main(String[] args){
				
		for(int count = 1000; count >= 0; count -=2){
			System.out.print(count + " ");
			if (count % 20 == 0)System.out.println();
		}
	}
}
