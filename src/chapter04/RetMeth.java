package chapter04;
/*
	Use a return value
	@author: Max Wilson
	25 May 2020
*/
class Vehicle2{
	int passengers;
	int fuelcap;
	int mpg;
	
	// display de range
	int range(){
		return fuelcap * mpg;
	}	
	
}

class RetMeth{
	public static void main(String[] args){
	
		Vehicle2 minivan = new Vehicle2();
		Vehicle2 sportcar = new Vehicle2();
				
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
				
		sportcar.passengers = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;		
				
		System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + minivan.range() + " miles.");
		
		System.out.println("Sportcar can carry " + sportcar.passengers + " with a range of " + sportcar.range() + " miles.");

	}
}
