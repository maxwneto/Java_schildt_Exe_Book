/*
	A simple constructor.
	@author: Max Wilson
	27 May 2020
*/
class MyClass{
	int x;
	
	MyClass(){
		x = 10;
	}
}

c/lass ConsDemo{
	public static void main(String[] args){
		MyClass t1 = new MyClass();
		MyClass t2 = new MyClass();
		
		System.out.println(t1.x + " " + t2.x);
	}
}
