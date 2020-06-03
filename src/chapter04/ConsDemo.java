package chapter04;
/*
	A simple constructor.
	@author: Max Wilson
	27 May 2020
*/
class MyClass2{
	int x;
	
	MyClass2(){
		x = 10;
	}
}

class ConsDemo{
	public static void main(String[] args){
		MyClass2 t1 = new MyClass2();
		MyClass2 t2 = new MyClass2();
		
		System.out.println(t1.x + " " + t2.x);
	}
}
