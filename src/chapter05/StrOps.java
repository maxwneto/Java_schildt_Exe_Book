package chapter05;
/* 
	Some string operations
	@author: Max Wilson
	01 Jun 2020
*/
class StrOps{
	public static void main(String[] args){
		String str1 = "When it comes to Web Programming, Java is #1.";
		String str2 = new String(str1);
		String str3 = "Java strings are powerfull";
		String str4 = str1 + "\n" + str2 + "\n" + str3;
		int result, idx;
		char ch;
		
		System.out.println("Length of srt1 :" + str1.length());
		
		// display  srt1, one char at a time.
		for(int i = 0; i < str1.length(); i ++)
			System.out.print(str1.charAt(i) + " ");
		
		System.out.println();
		
		if(str1.equals(str2))
			System.out.println("str1 equals str2");
		else
			System.out.println("str1 does not equal str2");
		
		if(str1.equals(str3))
			System.out.println("str1 equals str3");
		else
			System.out.println("str1 does not equal str3");
		
		result = str1.compareTo(str3);
		if(result == 0)
			System.out.println("str1 and str3 are equal.");
		else if  (result < 0)
			System.out.println("str1 is less the string");
		else
			System.out.println("str1 is greater than str3");
		
		//assign a new string to str2
		str2 = "One Two Three One";
		idx = str2.indexOf("One");
		System.out.println("Index of first occurence of One: " + idx);
		idx = str2.lastIndexOf("One");
		System.out.println("Index of last occurence of One: " + idx);
		
		System.out.println(str4);
		
	}
}
	
