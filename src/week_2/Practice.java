package week_2;

public class Practice {

	public static void main(String[] args) {
		
		double[] numbers = {4.1, 5.2, -6, 0.3, 10.5};		
		double largestNumber = numbers[0];
		
		for(double d: numbers)
		{
			if (d > largestNumber)
			{
				largestNumber = d;
			}
		}
		
		System.out.print("The largest number is " + largestNumber);
	}

}
