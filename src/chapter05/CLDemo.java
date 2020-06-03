package chapter05;
/*
  Display all command-line information
  @author: Max WIilson
  02 Jun 2020
*/
class CLDemo{
  public static void main(String args[]){
        System.out.println("There are  " + args.length + " command-line arguments.");

        System.out.println("They are: ");
        for (int i = 0; i < args.length; i++)
              System.out.println("args[" + i + "] : " + args[i]);
    }

}