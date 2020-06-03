package chapter02;
/*
	Demonstrate dynamic initialization
	Max Wilson
	13:43 14/05/2020
*/
	class DynInit{
		public static void main(String[] args){
			double radius = 4, height = 5;
			
			// dynamically initialize volume
			double volume = 3.1416 * radius * radius * height;
			
			System.out.println("Volume is " + volume);
		}
	}
