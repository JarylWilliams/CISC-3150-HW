/*
 *CISC.3150 HW1 Question#2
 *Area of the Circle
 */

/**
 *
 * @author Jaryl Williams
 */
import java.util.*;



public class Area { 
    public static void main(String[] args) { 
	double rad, area; // declaration of radius and area
     
        
        Scanner input = new Scanner (System.in); //user input for number(s) of circle
            System.out.println("Enter radius for circle" ); //radius input
	
                 do {
                   rad = input.nextDouble();
                    area = Math.PI * Math.pow(rad, 2); //calculation of the area 
                    System.out.println("Area of the cirle is " + area); //Displaying area      
                {
               System.out.println ("Enter radius for circle");
             
             } }while (input.hasNextInt());
             
            
    }
}
             
              
            

   