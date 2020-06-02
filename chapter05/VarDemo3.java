/**
 * Use type inference in a for loop.
 * @author: Max Wilson
 * 02 Jun 2020
 */
public class VarDemo3 {
    public static void main(String args[]){
        System.out.print("Values of x: ");
        for(var x = 2.5; x < 100.00; x *= 2)
            System.out.print(x + " ");
    }
    
}