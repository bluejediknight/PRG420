package week_4;

import java.util.*;

public class PRG420Week4_SupportingActivity_ArrayList {

	// https://stackoverflow.com/questions/20748848/why-removerange-method-of-arraylist-class-is-not-working/20749687
	
   public static void main(String args[]) 
   {
	   // Instantiate our custom Class
	   StudentList studentList = new StudentList();
	   
	   // Display the initial List
	   System.out.println("Initial List:");
	   studentList.writeList();
	   
	   // Add new students using built-in method
	   studentList.add(0, "Sue");
	   studentList.add(1, "Linda");

	   // Display the list after adding
	   System.out.println("\nList after Adding:");
	   studentList.writeList();
	   
	   // Remove a range using our custom method
	   studentList.removeStudents(4, 6);
	   
	   // Display the list after removing
	   System.out.println("\nList after Removing:");
	   studentList.writeList();
	   
	   // Sort the list
	   studentList.sort(null);

	   // Display the final list 
	   System.out.println("\nFinal Sorted List:");
	   studentList.writeList();
   }
}