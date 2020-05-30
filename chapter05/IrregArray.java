/*
	irregular array
	@author: Max Wilson
	30 May 2020
*/
class IrregArray{
	public static void main(String[] args){
		int vet[][] = new int [7][];
		vet[0] = new int [10];
		vet[1] = new int [10];
		vet[2] = new int [10];
		vet[3] = new int [10];
		vet[4] = new int [10];
		vet[5] = new int [2];
		vet[6] = new int [2];
		
		for(int a = 0; a < 5; a++)
			for(int b = 0;b < 10; b ++)
				vet[a][b] = (a + b) + 10;
		
		for(int a = 5; a < 7; a++)
			for(int b = 0;b < 2; b ++)
				vet[a][b] = (a + b) + 10;
				
		for(int a = 0; a < 5; a++){
			for(int b = 0;b < 10; b ++)
				System.out.print(vet[a][b] + "\t");
			System.out.println("\n");		
		}
		
		for(int a = 5; a < 7; a++){
			for(int b = 0;b < 2; b ++)
				System.out.print(vet[a][b] + "\t");
			System.out.println("\n");		
		}
		
	}
	
	
}
