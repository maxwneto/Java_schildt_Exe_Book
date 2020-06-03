package chapter04;
/*
	counter object
	@author: Max Wilson
	27 May 2020
*/
class MyCounter{
	int count;
	
	MyCounter(int count){
		this. count = count;
	}
	
	int getCount(){
		return this.count;
	}
}

class MyCounterExe{
	public static void main(String[] args){
		MyCounter counter = new MyCounter(10);
		
		System.out.println(counter.getCount());
		
	}
}
