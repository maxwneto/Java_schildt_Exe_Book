package chapter03;
/*
   Program to print prime number
   between 2 and 100.
   @author Max Wilson
   16 May 2020
*/
class PrimeNumbers{
   public static void main(String[] args){
      int cont;
      for (cont = 2; cont <= 100; cont++){
         if(ehPrimo(cont)){
	    System.out.println(cont + " é primo.");
         }  
      }
   }
   private static boolean ehPrimo(int numero) {
      for (int j = 2; j < numero; j++) {
         if (numero % j == 0){
            return false;
	 } 
      }
      return true;
  }
}
