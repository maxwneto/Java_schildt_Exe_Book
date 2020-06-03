package chapter04;
/*
	This program creates two Vehicle objects.
	@author: Max Wilson
	24 May 2020
*/
class Vehicle3{
	int passengers;
	int fuelcap;
	int mpg;
}

class TwoVehicles{
	public static void main(String[] args){
	
		Vehicle3 minivan = new Vehicle3();
		Vehicle3 sportcar = new Vehicle3();
		
		int range1, range2;
		
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		sportcar.passengers = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;
		
		range1 = minivan.fuelcap * minivan.mpg;
		range2 = sportcar.fuelcap * sportcar.mpg;
		
		System.out.println("Minivan car carry " + minivan.passengers
		+ "with a range of " + range1);

		System.out.println("Sportcar car carry " + sportcar.passengers
		+ " with a range of " + range2);
	}
}
