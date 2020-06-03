package chapter05;
/*
	Array bidimensional
	@author: Max Wilson
	30 May 2020*/
class TableD{
	public static void main(String[] args){
		int table[][] = new int [3][4];
		
		for (int a = 0; a < 3; a++)
			for(int b =0; b < 4;b++)
				table[a][b] = (a * 4) + b + 1;
				
				
		for (int a = 0; a < 3; a++){
			for(int b =0; b < 4;b++)
				System.out.print(table[a][b] + "\t");
			System.out.println("\n");
		}
	}
	
}
