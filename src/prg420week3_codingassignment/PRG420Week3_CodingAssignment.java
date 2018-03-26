/**************************************************************************************
* Program:     PRG/420 Week 3 
* Purpose:     Week 3 Coding Assignment 
* Class:       PRG/420       
* Creation Date:  March 8, 2018
******************************************************************************************
* Program Summary:   For, while, and do-while loops; nested loops
* 
* For this assignment, you will add code to create:
* 
* a for loop nested inside another for loop
* a while loop
* a do-while loop

*****************************************************************************************/

package prg420week3_codingassignment;

public class PRG420Week3_CodingAssignment {

    public static void main(String[] args) {
    
	    int linesOfAsterisks = 5;  	    
	    for (int i = 1; i <= linesOfAsterisks; i++) { 
	
			// For loop to write the desired number of asterisks
			for(int x = 1; x <= i; x++) 
			{
				// Use a print to keep them on the same line
				System.out.print("*");
			}
			 
			// Write a line break
			System.out.println();
		}
	 
	    
	    int num=10;
	    
	    // While loop checks that num is greater than 0
	    while (num > 0)
	    {
	    	// Writes the number
	    	System.out.println(num);
	    	
	    	// decrements the number
	    	num--;
	    }
	    
	
	
	    int sum = 0;
	    int numberOfSevens = 0;
	
	    // While sum is less than 157
	    while(sum < 157)
	    {
	    	// Print the line
	    	System.out.println(numberOfSevens + " sevens = " + sum);
	    	
	    	// Increment the number of sevens
	    	numberOfSevens++;
	    	
	    	// Add to the sum
	    	sum = sum + 7;
	    }

    }
}


        
        
