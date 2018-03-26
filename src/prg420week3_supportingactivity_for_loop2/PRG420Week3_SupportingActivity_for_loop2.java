/**************************************************************************************
* Program:  PRG/420 Week 3 
* Purpose:     Week 3 Enrichment Assignment 
* Class:       PRG/420       
* Creation Date:  10/22/17
******************************************************************************************
* Program Summary:   The for loop 
* For this coding example, the “for” loop coding will demonstrate decreasing,
* or decrementing, the defined variable. 
* 
* This code demonstrates that we don't have to increase (increment) a loop counter.
* We can decrease (decrement) it, too. And we don't have to increment or decrement by 1--we can
* increment or decrement by whatever number we want, just as we can count forward or backward
* in our natural language by ones, twos, fives, tens, etc. We choose to increment or decrement
* (and by how much) based on the situation we are trying to code. For example, if 
* we are writing a Java app that awards every third customer a coupon, we could increment
* the for loop by 3 each time.*
*****************************************************************************************/

package prg420week3_supportingactivity_for_loop2;

public class PRG420Week3_SupportingActivity_for_loop2 {
    
 public static void main(String args[]) { // stating the mandatory “public“ code line    
	 
         for(int i=1; i<=10; i++) {		

        	  // Print the value
              System.out.print("The value of i is: "+i);	
              
              // Use a fancy math operation
              if(i % 3 == 0)
              {
            	  System.out.print(" and you are the third customer!");
              }
              
              // Line break
              System.out.println();
         } 
    }
}
