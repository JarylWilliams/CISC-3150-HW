/*
 *CISC.3150 HW1 Question#5, Triangle program
 */

/**
 *
 * @author Jaryl Williams
 */

import java.util.*;



public class Triangle {
   
    
    public static void main (String [] args)
    {
        double aXcord, aYcord, bXcord; //Declaration of Variables
        double bYcord, cXcord, cYcord;
        double aBlength, aClength, bClength;
        
        Scanner input = new Scanner(System.in); //Inputting coordinates
        
             System.out.println ("Enter x coordinate for side a");
             aXcord = input.nextDouble ();
             
             System.out.println ("Enter y coordinate for side a");
             aYcord = input.nextDouble ();
             
             System.out.println ("Enter x coordinate for side b");
             bXcord = input.nextDouble ();
             
             System.out.println ("Enter y coordinate for side b");
             bYcord = input.nextDouble ();
         
             System.out.println ("Enter x coordinate for side c");
             cXcord = input.nextDouble ();
             
              System.out.println ("Enter y coordinate for side c");
              cYcord = input.nextDouble ();
         
         //Calculation of Length 
                    aBlength = Math.sqrt(Math.pow(bXcord-aXcord,2)) + Math.pow(bYcord-aYcord,2); //sqrt((x2-x1)^2+(y2-y1)^2)
                    aClength = Math.sqrt(Math.pow(cXcord-aXcord,2)) + Math.pow(cYcord-aYcord,2);
                    bClength = Math.sqrt(Math.pow(cXcord-bXcord,2)) + Math.pow(cYcord-bYcord,2);
      
                    
                    
    //Output to the user 
    if (aBlength + aClength <= bClength)
    {
                    
        System.out.println ("Sorry this triangle is fake");
    
    }
  
    else {
        System.out.println ("The triangle is real!");
    }
    
    
}
}