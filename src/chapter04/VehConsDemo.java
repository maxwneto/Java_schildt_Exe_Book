package chapter04;
/*
	Add a Contructor on vehicle.
	@author: Max Wilson
	27 May 2020
*/
class Vehicle{
	int passengers, fuelcap, mpg;
	
	Vehicle(int p, int f,int m){
		passengers = p;
		fuelcap = f;
		mpg = m;
	}	
	// display de range
	int range(){
		return fuelcap * mpg;
	}	
	// display fuel neeed to deslocate	
	double fuelNeeded( int miles){
		return miles / mpg;
	}
}

class VehConsDemo{
	public static void main(String[] args){
	
	Vehicle minivan = new Vehicle(7,16,21);
	Vehicle sportcar = new Vehicle(2,14,12);
		
		double gallons;
		int dist = 252;
				
		gallons = minivan.fuelNeeded(dist);
						
		System.out.println("To go " + dist + " miles minivan needs " + gallons 
		+ " gallons of fuel.");
		
		gallons = sportcar.fuelNeeded(dist);
						
		System.out.println("To go " + dist + " miles sportcar needs " + gallons 
		+ " gallons of fuel.");

	}
}
