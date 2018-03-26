package week_4;

public class LogicalOps {

	public static void main(String[] args) 
	{
		compare(true, true);
		compare(true, false);
		compare(false, false);
	}
	
	private static void compare(Boolean a, Boolean b)
	{
		System.out.println("IF a = " + a + 
				" AND b " + b + " THEN:");
		System.out.println("a & b = " + (a & b));
		System.out.println("a | b = " + (a | b));
		System.out.println("a ^ b = " + (a ^ b));
		System.out.println("  ! a = " + (!a));
		System.out.println("  ! b = " + (!b));
		System.out.println();
	}

}
