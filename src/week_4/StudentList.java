package week_4;

import java.util.ArrayList;
@SuppressWarnings("serial")

public class StudentList extends ArrayList<String> 
{
	public StudentList() 
	{						
		// Populate the list
		this.add("Tom");
		this.add("Harry");
		this.add("Larry");
		this.add("Moe");
		this.add("Jack");
	}
	
	public void removeStudents(int from, int to)
	{
		this.removeRange(from, to);
	}
	
	public void writeList()
	{
		for(String student: this)
		{
			System.out.println(student);
		}
	}
}
