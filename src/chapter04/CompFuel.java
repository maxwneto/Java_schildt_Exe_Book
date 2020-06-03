package chapter04;
/*
	Add a parameterized method that computes the
	fuel required for a given distance
	@author: Max Wilson
	25 May 2020
*/
class Vehicle1{

	int passengers;
	int fuelcap;
	int mpg;
	
	// display de range
	int range(){
		return fuelcap * mpg;
	}	
	// display fuel neeed to deslocate	
	double fuelNeeded( int miles){
		return miles / mpg;
	}
	
}

class CompFuel{
	public static void main(String[] args){
	
		Vehicle1 minivan = new Vehicle1();
		Vehicle1 sportcar = new Vehicle1();
		
		double gallons;
		int dist = 252;
				
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
				
		sportcar.passengers = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;		
		
		gallons = minivan.fuelNeeded(dist);
						
		System.out.println("To go " + dist + " miles minivan needs " + gallons 
		+ " gallons of fuel.");
		
		gallons = sportcar.fuelNeeded(dist);
						
		System.out.println("To go " + dist + " miles sportcar needs " + gallons 
		+ " gallons of fuel.");

	}
}
