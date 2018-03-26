package week_3;

public class Formatter {
	
	private double x;
	private double y;
	
	Formatter(double numerator, double denominator) {
		x = numerator;
		y = denominator;
	}
	
	public void GetResult()
	{
		System.out.println(x/y);
	}
	
	public void GetFormattedResult()
	{
		System.out.printf("%.2f", x/y);
	}

}
