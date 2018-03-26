package week_5;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class timeplay 
{

	public static void main(String[] args) 
	{	
		getTime(ZoneId.of("US/Central"));
		getTime(ZoneId.of("US/Pacific"));
		getTime(ZoneId.of("US/Eastern"));
	}
	
	private static void getTime(ZoneId zoneid)
	{
		// Get a local zonedDateTime object to start from
		LocalDateTime now = LocalDateTime.now();
		ZonedDateTime zonedLocalTime = now.atZone(ZoneId.systemDefault());
		
		// Get the local time in the other TimeZone
		ZonedDateTime zonedOtherTime = zonedLocalTime.withZoneSameInstant(zoneid);
		
		// Write the results
		System.out.println(zoneid + " - " + 
				zonedOtherTime.getDayOfWeek() + ", " +
				zonedOtherTime.format(
						DateTimeFormatter.ofPattern("HH:mm:ss")));		
	}
}
