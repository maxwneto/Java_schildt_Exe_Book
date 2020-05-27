/*
	return a double
	@author: Max Wilson
	27 May 2020
*/
class MyMeth{
	int workHours;
	double valueHour,earn;
	
	MyMeth(int workHours, double valueHour){
		this.workHours = workHours;
		this.valueHour = valueHour;
		this.earn = workHours * valueHour;
	}
	
	double getEarn(){
		return this.earn;
	}
}

class RetMath{
	public static void main(String[] args){
		MyMeth earn1 = new MyMeth(192,45.50);
		
		System.out.println("Earn: " + earn1.getEarn());
		
	}
}
