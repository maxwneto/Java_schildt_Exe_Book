package chapter02;
/*
	Program to compute ins feets how far away
	a listener is from a lightning strike.
	Max Wilson
	23:41 13/05/2020
*/
class Sound{
	public static void main(String[] args){
		double interval = 7.2;
		int distance = 1100;
		double result = distance * interval;
		
		System.out.println("The distance between a listener and the lighting strike is " 
		+ result + " feet.");
	}
}	
