/*
	Program that increment cont + cont
	@author: Max Wilson
	24 May 2020
*/
import java.util.*;
class PrintIncrementToIncrement{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Type a number: ");
		num = sc.nextInt();
		
		for(int cont = 1; cont <= num; cont +=cont)
			System.out.println(cont);
	}
}
