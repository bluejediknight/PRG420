/**********************************************************************
*	Program:	 PRG420Week1_AnalyzeAssignment
* 	Purpose: 	 Week 1 Analyze Assignment	
*	Programmer:	 Iam A. Student			
*	Class:		 PRG/420			
*	Creation Date:	 10/11/17
*********************************************************************
*
**********************************************************************
*	Program Summary: This program demonstrates
*                        the following basic Java concepts:
*
*                           - importing a Java library
*                           - getting user input
*                           - declaring and populating values
*                           - manipulating (concatenating) strings
*                           - producing output (displaying a formatted message onscreen)
**********************************************************************/

package week_1;

/**
 *
 * @author iastudent
 */

// If we want to use the Scanner class (type) to get user input, we need
// to import the following Java package that includes the Scanner class
// definitions. We do not have to add an import statement to use the
// print() or println() methods of the System object, because they
// are built in.

import java.util.Scanner;

public class PRG420Week1_Enrichment {

/*  The main() method you see below is special. It tells the Java interpeter to "start here."
    EVERY JAVA APPLICATION OR APP MUST HAVE A MAIN METHOD CALL THAT LOOKS LIKE THIS:
    public static void main(String[] args) {}
    
    The "meat" of the program goes between the curly braces.
    The main() method can take an array of strings (called args, which is short for "arguments").
    However, in this case, we are not passing any arguments to the main() method and we are not
    referencing the args variable anywhere in the body of the main() method. We are simply
    telling the Java interpreter to begin running the first line within the curly braces and
    keep going until the last line within the curly braces.
*/
       
    public static void main(String[] args) {
        
        // Display a message on the console using the println() method.
        System.out.println("Display the line.");   //  Display the string "Display the line"
        
        // Similar result to above--only this time, we will call the println() method with a variable.
        String myStringVariable;  // Declare a variable of type String called myStringVariable
        myStringVariable = "Hello, world!"; // Assign string value "Hello, world!" to myStringVariable    
        System.out.println(myStringVariable); // Display this new string on the console
        
        //Similar result to the two above--only this time, we will ask for a string from the user
        //and use that string to format and display a greeting on the console.
        Scanner myInputScannerInstance = new Scanner(System.in); // Create a usable instance of an input device (which for most people is a keyboard)
        System.out.print("Please type a word and then press Enter: ");  // Prompt user for input. print() does not add a carriage return.
        // Capture first word user types in (ignore everything after the first space) and assign it to variable sentenceYouTyped
        String sentenceYouTyped = myInputScannerInstance.next(); 
        // Construct and display the message. The println() method adds a carriage return.
        System.out.println("You just typed in this word: |" + sentenceYouTyped + "|"); 
    }
    
}



