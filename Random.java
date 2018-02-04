/*
 *CISC.3150 HW1 Question#3
 *Random number and month of the year generator
 */

/**
 *
 * @author Jaryl Williams
 */
import java.util.*;

public class Random {
    public static void main (String [] args) {
int month = (int)((Math.random() * 12) + 1); //Stackoverflow Random function look up 

		System.out.println (month); //prints numerical value of the month
    
                if (month == 1) //If else statements to print the months
                    System.out.println ("The month is January"); 
                else
                        if  (month ==2)
                            System.out.println ("The month is  Febuary");
    
    else
                        if  (month ==3)
                            System.out.println ("The month is March");
    
    else
                        if  (month ==4)
                            System.out.println ("The month is April"); 
                else
                        if  (month ==5)
                            System.out.println ("The month is May");
                
                
                else
                        if  (month ==6)
                            System.out.println ("The month is June");
    
    else
                        if  (month ==7)
                            System.out.println ("The month is July"); 
                else
                        if  (month ==8)
                            System.out.println ("The month is August");
   else
                        if  (month ==9)
                            System.out.println ("The month is September"); 
                else
                        if  (month ==10)
                            System.out.println ("The month is October");
                else
                        if  (month ==11)
                            System.out.println ("The month is November"); 
                else
                        if  (month ==12)
                            System.out.println ("The month is December");
    }
    }
