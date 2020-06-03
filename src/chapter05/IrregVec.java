package chapter05;
/*
	Irregular Array Test
	@author: Max Wilson
	31 May 2020
*/
class IrregVec{
	public static void main(String[] args){
		int nums[][] = new int [3][];
		nums[0] = new int[3];
		nums[1] = new int[4];
		nums[2] = new int[5];	
		
		
		for(int a = 0; a < 1; a++)
			for(int b = 0; b < 3; b++)
				nums[a][b] = (a + b) + 10;
		
		for(int a = 1; a < 2; a++)
			for(int c = 0; c < 4; c++)
				nums[a][c] = (a + c) + 10;
		
		for(int a = 2; a < 3; a++)	
			for(int d = 0; d < 5; d++)
				nums[a][d] = (a + d) + 10;
		
		
		for(int a = 0; a < 1; a++){
			for(int b = 0; b < 3; b++)
				System.out.print(nums[a][b] + " ");
				
			System.out.println("\n");
		}
			
		for(int a = 1; a < 2; a++){
			for(int c = 0; c < 4;c++)
				System.out.print(nums[a][c] + " ");
				
			System.out.println("\n");
		}
		
		for(int a = 2; a < 3; a++){	
			for(int d = 0; d < 5; d++)
				System.out.print(nums[a][d] + " ");
				
			System.out.println("\n");
		}
	}
}
