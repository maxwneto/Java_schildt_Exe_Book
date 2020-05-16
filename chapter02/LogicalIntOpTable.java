/*
	A truth table for the logical operators.
	@author Max Wilson
	15 May 2020
*/
class LogicalIntOpTable{
	public static void main(String[] args){
		
		   boolean p, q;

        // below is an alternative truth table in binary form (0s and 1s)
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true; q = true;
        System.out.print(toBinary(p) + "\t" + toBinary(q) + "\t");
        System.out.print(toBinary(p&q) + "\t" + toBinary(p|q) + "\t");
        System.out.println(toBinary(p^q) + "\t" + toBinary(!p) + "\t");

        p = true; q = false;
        System.out.print(toBinary(p) + "\t" + toBinary(q) + "\t");
        System.out.print(toBinary(p&q) + "\t" + toBinary(p|q) + "\t");
        System.out.println(toBinary(p^q) + "\t" + toBinary(!p) + "\t");

        p = false; q = true;
        System.out.print(toBinary(p) + "\t" + toBinary(q) + "\t");
        System.out.print(toBinary(p&q) + "\t" + toBinary(p|q) + "\t");
        System.out.println(toBinary(p^q) + "\t" + toBinary(!p) + "\t");

        p = false; q = false;
        System.out.print(toBinary(p) + "\t" + toBinary(q) + "\t");
        System.out.print(toBinary(p&q) + "\t" + toBinary(p|q) + "\t");
        System.out.println(toBinary(p^q) + "\t" + toBinary(!p) + "\t");
    }

    // this method exchanges true for 1, and false for 0 
    private static int toBinary(boolean value) {
        if(value == true)
            return 1;
        else
            return 0;
    }
	
}
