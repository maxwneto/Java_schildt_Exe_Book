/*
   Guess the letter game.
   @author: Max Wilson
   18 May 2020
*/
class Guess{
   public static void main(String[] args)
   throws java.io.IOException{
   	char ch, answer = 'K';   	
   	
   	System.out.print("I'm thinking of a letter between A and Z.\nCan you guess it: ");
   	
   	ch = (char) System.in.read();
   	
   	if(ch == answer){
   	System.out.println("** Right **");
   	}
   }
}
