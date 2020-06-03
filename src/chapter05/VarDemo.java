package chapter05;

/*
    A simple demonstration of local variable type inference.
    @author: Max Wilson
    02 Jun 2020
*/
public class VarDemo {
    public static void main(String args[]){
        var idade = 39;
        int var = 20;
        int k = var;

        System.out.println("Idade: " + idade + "\nVar: " + var + "\nK: " + k);
    }
    
}