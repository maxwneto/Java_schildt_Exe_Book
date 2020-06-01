/*
	Use for-each style for on a two-dimensional array.
	@author: Max Wilson
	01 Jun 2020
*/
class ForEach2D	{
	public static void main(String[] args){
		int nums[][] = new int[3][5];
		int sum = 0;
		
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 5; j++)
				nums[i][j] = (i + 1) * (j + 1);
	

		for(int x[]:nums)
			for(int y: x) {
				System.out.println ("Value y is: " + y);
				sum += y;
			}
		
		System.out.println("Sum is: " + sum);
	}
}