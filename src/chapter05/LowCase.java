package chapter05;
/**
 * Lowercase letters.
 * @author: Max Wilson
 * 02 Jun 2020
 */
public class LowCase {
    public static void main(String args[]){
        char ch;

        for(int i = 0; i < 10; i++){
            ch = (char) ('A' + i);
            System.out.print(ch);

            ch = (char) ((int) ch | 32); //ch is now lowercase
            System.out.print(ch + " ");
        }
    }
    
}