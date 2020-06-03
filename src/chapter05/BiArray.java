package chapter05;
/*
	Bidimensional Array Test
	@author: Max Wilson
	31 May 2020
*/
class BiArray{
	public static void main(String[] args){
		int nums[][] = new int [3][5];
		
		for(int a = 0; a < 3; a++)
			for(int b = 0; b < 5; b++)
				nums[a][b] = (a * 5) + b + 1;
		
		for(int a = 0; a < 3; a++){
			for(int b = 0; b < 5; b++)
				System.out.print(nums[a][b] + " ");
			System.out.println("\n");
		}
	}
}
