/* 
	A negatively running for loop.
	@author: Max Wilson
	18 May 2010
*/
	class DecrFor{
		public static void main(String[] args){
			int x;
			
			for(x = 100; x > - 100; x -= 5){
				System.out.print(x + " ");
				
				if(x % 50 == 0)
					System.out.println();
			}
			
			System.out.println();
			
		}
		
	}
