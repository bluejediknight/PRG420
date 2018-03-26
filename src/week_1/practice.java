package week_1;

import java.util.Date;
import java.sql.*;

public class practice {

	public static void main(String[] args) {

		int x = 0;
		
		while(x < 100)
		{
			x++;
			
			if (x > 2 && x < 10)
			{
				continue;
			}
			
			if (x == 12)
			{
				break;
			}
			
			System.out.println(x);

		}
		
	}

}
