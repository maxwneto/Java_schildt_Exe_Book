package chapter02;
/*
	Use the Pythagorean theorem to
	find the length of the hypotenuse
	given the lenths of the two opposing
	sides.
	Max Wilson
	23:07 13/05/2020
*/
class Hypo{
	public static void main(String[] args){
		double x,y,z;
		
		x = 3;
		y = 4;
		
		z = Math.sqrt(x*x + y*y);
		
		System.out.println("Hypotenuse is " + z);
	}
}	
