/*
	Using break with nested loops.
	@author: Max Wilson
	21 May 2022
*/
class Break3{
	public static void main(String[] args){
		for (int i = 0; i < 3; i++){
			System.out.println("Outer loop count: " + i);
			System.out.print(" Inner loop count: ");
			int t = 0;
			while(t < 100){
				if(t == 0)break;
				System.out.print(t + " ");
				t++;
			}
			System.out.println();
		}	
	}
}