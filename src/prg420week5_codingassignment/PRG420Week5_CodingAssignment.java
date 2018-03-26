/************************************************************************************
* Program:  PRG/420 Week 5 
* Purpose:     Week 5 Coding Assignment
* Class:       PRG/420       
* Creation Date:  March 23, 2018
*************************************************************************************
* Program Summary:   
*	This program converts a given date to a string.    
*     	The code includes exception handling for a ParseException. 
************************************************************************************/

package prg420week5_codingassignment;

import java.util.*;     // wildcard to import all the util. classes 
import java.text.*;     // wildcard to import all the text classes   

public class PRG420Week5_CodingAssignment 
{
	public static void main(String[] args)
	{
	    // The getInstance() method returns a Calendar object whose calendar fields have been initialized with the current date and time.
	    Calendar calendar = Calendar.getInstance(); 
	    {
		    try
		    {    
		    	// Declare a string that we will use later to format a date like this: ##-XXX-##
		        String str_date="01-Nov-17"; 
		        
		        // Uncomment this line to test the exception handling
		        // str_date="xxx"; 
		        
		        DateFormat formatter;  // Declare an object of type DateFormat so that we can call its parse() method later
		        Date myFormattedDate; // Declare a variable of type Date to hold the formatted date
		        
		        // Assign a specific date format to the formatter variable
		        formatter = new SimpleDateFormat("dd-MMM-yy");    
			        
		        // setting up the format
		        myFormattedDate = (Date)formatter.parse(str_date);
		        
		        // Print the results
		        System.out.println("The formatted date is " + myFormattedDate);
		        System.out.println("Today is " +calendar.getTime() );	            
		    } 
		    catch (ParseException ex)
		    {
		    	// Print the error message (ERROR: java.text.ParseException: Unparseable date: "xxx")
		    	System.out.println("ERROR: " + ex );
		    }  
	    }
    }
}