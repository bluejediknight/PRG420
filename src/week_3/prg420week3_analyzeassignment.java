package week_3;

public class prg420week3_analyzeassignment{

    public static void main(String[] args) {
        
        // for loops are a good choice when you have a specific number of values
        // you want to iterate over and apply some calculation to.
        System.out.println("FOR LOOP - Here are the taxes on all 10 prices:");
        
        double taxRate = 0.08;
        for (int price=1; price<=10; price++) {
            System.out.println("The 8% tax on " + price + " dollar(s) is " + "$" + (price * taxRate));
        }
        System.out.println(""); // Leave a blank space
        
        // while loops are a good choice when you're looking through a pile of values
        // and want to execute some logic while some condition is true.
        // while loops MAY OR MAY NOT EVER EXECUTE, depending on the counter value.
        int dollars=1;
        System.out.println("WHILE LOOP - Here are the taxes on prices less than $5:");
        while (dollars < 5) {
             System.out.println("The 8% tax on " + dollars + " dollar(s) is $" + (dollars * taxRate));
             dollars++;
        }
        System.out.println(""); // Leave a blank space
        
        // do-while loops are also a good choice when you're looking through a pile of values
        // and want to execute some logic while some condition is true.
        // do while loops ALWAYS EXECUTE AT LEAST ONCE, no matter what the counter value.
        // For example, in the code below, we want to print out the tax only on those 
        // amounts smaller than $1.  But because we're using the do-while loop, the code
        // will execute the body of the loop once before it even checks the condition! So
        // we will get an INCORRECT PRINTOUT.
        dollars=1;
        
        System.out.println("DO-WHILE LOOP - Here are the taxes on prices less than $1:");
        
        do {
             System.out.println("The 8% tax on " + dollars + " dollar(s) is $" + (dollars * 0.08));
             dollars++;
        } while (dollars < 1);
    }
}