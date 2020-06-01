/*
	using put and get to manipulate one int on array
	@author: Max Wilson
	01 Jun 2020
*/
import java.util.Scanner;
class ManipulatingQueue{
	int line[];
	int putloc, getloc;
	
	ManipulatingQueue(int size){
		line = new int[size];
		putloc = getloc = 0;
	}
	
	void put(int num){
		if(putloc == line.length){
			System.out.println(" - Queue is full");
			return;
		}
		line[putloc++] = num;
	}
	
	int get(){
		if(putloc == getloc){
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		return line[getloc++];
	}
}
class DManipulatingQueue{
	public static void main(String[] args) throws java.io.IOException{
		ManipulatingQueue l1;
		int size,num,i;
		Scanner sc = new Scanner(System.in);

		System.out.print("Type the size of array: ");
		size = sc.nextInt();

		l1 = new ManipulatingQueue(size);
		

		for (i = 1; i <= size; i++)
			l1.put(i);
		
		for (i = 1; i <= size; i++){
			num = l1.get();
			System.out.print(num + " ");
		}
			
	}
}