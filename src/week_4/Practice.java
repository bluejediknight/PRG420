package week_4;

public class Practice {

	public static void main(String[] args) 
	{
		String a = "USS Enterprise";
		String b = "uss Enterprise";
		
		// Replace
		b = b.replace("uss", "USS");
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a == b);
		System.out.println(a.equals(b));

	}

}
