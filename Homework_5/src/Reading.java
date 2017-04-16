import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Reading {

	private GregorianCalendar date;
	private int temp;
	
	Reading(GregorianCalendar date, int temp)
	{
		this.date = date; // the version with 3 arguments? Maybe?
		// a year, a month, and a day of month
		this.temp = temp;
	}
	
	public GregorianCalendar getReadingDate()
	{
		return this.date;
	}
	
	public int getTemp()
	{
		return this.temp;
	}
}
