/*
	Use nested loops to find factors of numbers
	between 2 and 100.
	@author: Max Wilson
	23 May 2020
*/
class FacNumbers{
	public static void main(String[] args){
		for (int i = 2; i <= 100; i++){
			System.out.print("Factor of " + i + " is : ");
			for (int j = 2; j < i;j++)
				if(i % j == 0)
					System.out.print( j + " ");
			System.out.println();
		}
	}
}
