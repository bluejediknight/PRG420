/**********************************************************************
*	Program:	 PRG420Week1_CodingAssignment	
* 	Purpose: 	 Week 1 Individual Assignment #2	
*	Class:		 PRG/420			
*	Creation Date:	 February 23, 2018
*********************************************************************
*
**********************************************************************
*	Program Summary: This program asks the user for a one-word name
*                        and then displays a constructed greeting
*                        that looks like this: 
*
*                        Hello, NAME!
**********************************************************************/

package week_1;

import java.util.Scanner;

public class PRG420Week1_ASM2 {
    
    public static void main(String[] args) 
    {
        // Create a usable instance of an input device
    	Scanner s = new Scanner(System.in);         

        // Prompt user for input
    	System.out.print("Enter your first name: ");

        // Capture first word and assign it to A VARIABLE
    	String firstName = s.next();

        // Construct the greeting 
    	System.out.println("Hello, " + firstName + "!");
    }
    
}
