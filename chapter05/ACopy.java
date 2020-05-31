/*
	Use lenght variable to help copy an array.
	@author: Max Wilson
	31 May 2020
*/
class ACopy{
	public static void main(String[] args){
		int i = 0;
		int nums1[] = new int[10];
		int nums2[] = new int[10];
		
		for(;i < nums1.length; i ++)
			nums1[i] = i * i;
		
		System.out.print("Size of nums1[] is : " + nums1.length
		+ "\nand the values are: \n");
		
		for(int num:nums1)
			System.out.print(num + " ");
			
		System.out.println("\n");
		
		//copy nums1 to nums2
		if(nums2.length >= nums1.length)
			for (i = 0; i < nums1.length; i++)	
				nums2[i] = nums1[i];	
				
		System.out.print("Size of nums2[] is : " + nums2.length
		+ "\nand the values are: \n");	
		
		for(int num:nums2)
			System.out.print(num + " ");	
			
		System.out.println();
		
	}
}
