/*
	Using break with a label
	@author: Max Wilson
	21 May 2020
*/
class Break4{
	public static void main(String[] args){
		int x;
		for(x = 1; x < 4;x++){
			one:{
				two:{
					three:{
						if(x == 1) break one;
						if ( x == 2) break two;
						if ( x == 3) break three;

						// this is never reched
						System.out.println("Won't print");

					}
					System.out.println("After block three");
				}
				System.out.println("After block two.");	

			}
			System.out.println("After block one.");

		}
		System.out.println("After for loop.");
	
	}
}