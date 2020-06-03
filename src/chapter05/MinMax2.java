package chapter05;
/*
	Use Array initializers.
	@author: Max Wilson
	28 May 2020
*/
class MinMax2{
	public static void main(String[] args){
		int nums[] = {99,-10,100123,18,-978,5623,463,-9,287,49};
		int max, min;
				
		min = max = nums[0];
		for (int i = 1;  i < 10; i++){
			if(nums[i] < min) min = nums[i];
			if(nums[i] > max) max = nums[i];
		}

		System.out.println("Min: " + min + "\nMax: " + max);
	}
}