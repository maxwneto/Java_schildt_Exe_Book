package chapter05;
/*
	Search an array using for-each style
	@author: Max Wilson
	01 Jun 2020
*/
import java.util.Scanner;
class Search{
	public static void main(String[] args){
		int nums[] = {6,15,34,51,66,71,88,95};
		boolean found = false;
		Scanner sc = new Scanner(System.in);

		System.out.print("Try guess a number: ");
		int guess = sc.nextInt();

		for(int num :nums)
			if(guess == num){
				found = true;
				break;
			}

		if(found)
			System.out.println("Value found.");
		else
			System.out.println("Value not found.");
	}
}