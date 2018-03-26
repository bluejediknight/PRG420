package week_4;

import java.util.Arrays;

public class BinSearch 
{
	public static void main(String[] args) 
	{
		int[] numbers = new int[] {1, 2, 3, 5, 6, 8, 10, 12, 13};		
		WhichPosition(numbers, 3);
		WhichPosition(numbers, 8);
		WhichPosition(numbers, 11);	
	}
	
	static void WhichPosition(int[] numbers, int grade)
	{
		int foundindex = Arrays.binarySearch(numbers, grade);
		if (foundindex >= 0)
		{
			System.out.println("That number was found "
					+ "and is at position " + (foundindex + 1));
		}
		else
		{
			System.out.println("That number was not found, "
					+ "but would be at position " + (foundindex * -1));
		}
	}
}
