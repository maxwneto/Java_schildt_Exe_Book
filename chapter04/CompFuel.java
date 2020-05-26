/*
	Add a parameterized method that computes the
	fuel required for a given distance
	@author: Max Wilson
	25 May 2020
*/
class Vehicle{

	int passengers;
	int fuelcap;
	int mpg;
	
	// display de range
	int range(){
		return fuelcap * mpg;
	}	
	
	double fuelNeeded( int miles){
		return miles / mpg;
	}
	
}

class CompFuel{
	public static void main(String[] args){
	
		Vehicle minivan = new Vehicle();
		Vehicle sportcar = new Vehicle();
		
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
