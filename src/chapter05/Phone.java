package chapter05;
/*
    A simple automated telephone directory
    @author: Max Wilson
    02 Jun 2020
*/
public class Phone {
    public static void main (String args[]){
        String numbers[][] = {
            {"Max","99160-9223"},
            {"Sara","98818-0861"},
            {"Heitor","98642-3412"}
        };

        int i;

        if(args.length != 1)
            System.out.println("Usage: java Phone <name>");
        else{
            for(i = 0; i < numbers.length; i++){
                if(numbers[i][0].equals(args[0])){
                    System.out.println(numbers[i][0] + ": " + numbers[i][1]);
                    break;
                }
        }

        if(i == numbers.length)
            System.out.println("Name not found.");
        }
    }
    
}