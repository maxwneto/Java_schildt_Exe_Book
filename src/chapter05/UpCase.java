package chapter05;
/**
 * Uppercase letters.
 * @author: Max Wilson
 * 02 Jun 2020
 */
public class UpCase {
    public static void main(String args[]){
        char ch;

        for(int i = 0; i < 10; i++){
            ch = (char) ('a' + i);
            System.out.print(ch);

            ch = (char) ((int) ch & 65503); //ch is now uppercase
            System.out.print(ch + " ");
        }


        System.out.println();
    }
    
}