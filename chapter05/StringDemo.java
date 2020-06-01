/* 
	Introduce String.
	@author: Max Wilson
	01 Jun 2020
*/
class StringDemo{
	public static void main(String[] args){
		// declare a String in various ways
		String str1 = new String("Java strings are objets");
		String str2 = ("They are constructed various ways.");
		String str3 = new String(str2);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}