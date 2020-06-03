package chapter04;
/*
	A program that uses the Vehicle class.
	@author: Max Wilson
	24 May 2020
*/
class Vehicle4{
	int passengers;
	int fuelcap;
	int mpg;
}

class VehicleDemo{
	public static void main(String[] args){
	
		Vehicle4 minivan = new Vehicle4();
		
		int range;
		
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		range = minivan.fuelcap * minivan.mpg;
		
		System.out.println("Minivan can carry " + minivan.passengers
		+ " with a range of " + range);
	}
}
