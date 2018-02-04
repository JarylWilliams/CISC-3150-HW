/*
 *CISC.3150 HW1 Question#6
 *Circle Program
 */

/**
 *
 * @author Jaryl Williams
 */

import java.util.*;
public class Circle {
    
    public static void main (String [] args) {
    
    double c1X, c1Y,c2X, c2Y; //Declaration of circle coordinates
    double c1Rad, c2Rad, dis; // Declaration of radius and distance formula
        
        
        
        
        
        Scanner input = new Scanner(System.in);
     
        
        
        System.out.println ("Enter Circle#1 center coordinate:"); //User Input
                c1X = input.nextDouble ();
                c1Y = input.nextDouble ();
       
            System.out.println ("Enter Circle#1 radius:");
                c1Rad = input.nextDouble ();
       
       
            System.out.println ("Enter Circle#2 center coordinate:");
                c2X = input.nextDouble ();
                c2Y = input.nextDouble ();
       
            System.out.println ("Enter Circle#2 radius:");
                c2Rad = input.nextDouble ();
      
            
            dis = Math.sqrt(Math.pow(c2X-c1X, 2) + Math.pow(c2Y-c1Y, 2));   //Calculation of Distance 
                                                                           //https://javatutoring.com/distance-between-two-points-java-program/
            
            if (c1Rad - c2Rad <= dis && c1Rad + c2Rad > dis)              //Logic for circle test 
                System.out.println ("The circles are overlapping!");    //https://stackoverflow.com/questions/9486520/finding-if-a-circle-is-inside-another-circle

            else if (c1Rad + c2Rad == dis)
                System.out.println ("The circles are currently touching!");

            else if (c1Rad + c2Rad < dis)
                System.out.println("The circles are seperated");
 
            else
                System.out.println("The circles are within each other");


          }

}