/*
	Assigning array reference variables.
	@author: Max Wilson
	30 May 2020
*/
class AssignARef{
	public static void main(String[] args){
		int i;
		int nums1[]= new int[10];
		int nums2[] = new int[10];
		
		for (i = 0; i < 10; i++)
			nums1[i] = i;
		
		for (i = 0; i < 10; i++)
			nums2[i] = -i;	
			
		for (i = 0; i < 10; i++)
			System.out.print(nums1[i] + "\t");
		System.out.println("\n");
		
		for (i = 0; i < 10; i++)
			System.out.print(nums2[i] + "\t");
		System.out.println("\n");
		
		nums2 = nums1;
		
		for (i = 0; i < 10; i++)
			System.out.print(nums2[i] + "\t");
		System.out.println("\n");
		
		nums2[3] = 99;	
		
		for (i = 0; i < 10; i++)
			System.out.print(nums1[i] + "\t");
		System.out.println("\n");
			
		
	}	
}
