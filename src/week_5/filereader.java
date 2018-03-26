package week_5;
import java.io.*;
public class filereader 
{
	public static void main(String[] args)
	{		
		readFile("sith.txt");
		readFile("404.txt");
	}

	private static void readFile(String path)
	{
		System.out.println("\nReading contents of " + path);
		BufferedReader reader = null;
		String line;
		try 
		{
			reader = new BufferedReader(new FileReader(path));
			line = reader.readLine();
			while(line != null)
			{
				System.out.println("\t" + line);
				line = reader.readLine();
			}
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("\tFile not found");
		}
		catch (IOException e) 
		{
			System.out.println("\tIO Error: " + e.getMessage());
		}
		finally
		{
			try
			{
				if (reader != null)
				{
					reader.close();
				}
			}
			catch(IOException e)
			{
				System.out.println("\tReader Closing Error: " 
						+ e.getMessage());	
			}
		}
	}
}
