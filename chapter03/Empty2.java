/*
	Move initialization out of loop
	@author: Max Wilson
	18 May 2020
*/
class Empty2{
	public static void main(String[] args){
		int i = 0;
		for( ; i < 10;){
			System.out.println("i = " + i);
			i++;
		}
	}
}
