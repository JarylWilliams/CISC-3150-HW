/*
 * CISC.3150 HW1 Question #4 
 * Feed numbers to file
 *
 */

/**
 *
 * @author Jaryl Williams
 */
import java.util.*;
        
//https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html

public class FileRead {
    
   public static void main (String [] args)
   {
       Scanner input = new Scanner (System.in);
       
            while (input.hasNext()) 
                System.out.println(input.nextLine());
       
   }
}


