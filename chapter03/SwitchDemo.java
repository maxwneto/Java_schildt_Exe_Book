/*
	Demonstrate the switch.
	@author Max Wilson
	18 May 2020
*/
class SwitchDemo{
	public static void main(String[] args){
		int i;
		
		for(i = 0; i < 10; i++){
			switch(i){
				case(0):
					System.out.println("x is zero");
					break;
				case(1):
					System.out.println("x is one");
					break;
				case(2):
					System.out.println("x is two");
					break;
				case(3):
					System.out.println("x is three");
					break;
				case(4):
					System.out.println("x is four");
					break;
				default:
					System.out.println("x is five or more");
			}
		}
	}
}
