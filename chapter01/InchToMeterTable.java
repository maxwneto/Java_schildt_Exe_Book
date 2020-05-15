/*  
   This program displays a conversion  
   table of inches to meters. 
 
   Call this program InchToMeterTable.java. 
*/  
class InchToMeterTable {  
  public static void main(String args[]) {  
    double inches, meters; 
    int counter; 
 
    counter = 0; 
    for(inches = 1; inches <= 144; inches++) { 
      meters = inches / 39.37; // convert to meters 
      System.out.println(inches + " inches is " + 
                         meters + " meters."); 
 
      // every 12th line, print a blank line        
      if(inches % 12  == 0) { 
        System.out.println(); 
      } 
    } 
  }  
}
