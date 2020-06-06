package chapter05;
/**
 * A class that display the binary representation of a value.
 * @author maxwilson
 *04 Jun 2020
 */

class ShowBitsD{
	int numbits;
	
	ShowBitsD(int n){
		numbits = n;
	}
	
	void show(long val) {
		long mask = 1;
		
		// left-shift a 1 into the proper position
		mask <<= numbits-1;
		
		int spacer = 0;
		for( ; mask != 0; mask >>>= 1) {
			if((val & mask) != 0) System.out.print("1 ");
			else System.out.print("0 ");
			spacer++;
			if((spacer % 8 ) == 0) {
				System.out.print(" ");
				spacer = 0;
			}
		}
		System.out.println();
	}
}

public class ShowBitDemo {
	public static void main(String args[]) {
		
		ShowBitsD b = new ShowBitsD(8);
		ShowBitsD i = new ShowBitsD(32);
		ShowBitsD li = new ShowBitsD(64);
		
		System.out.println("123 in binary: ");
		b.show(123);
		
		System.out.println("\n87987 in binary: ");
		i.show(87987);
		
		System.out.println("\n237658768 in binary: ");
		li.show(237658768);
		
		// we can also show low-order bits of any integer
		System.out.println("\n87987 in binary: ");
		b.show(87987);
		
	}	

}
