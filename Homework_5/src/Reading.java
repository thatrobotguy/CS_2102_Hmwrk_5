import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Reading {

	private GregorianCalendar  date;
	private int temp;
	
	Reading(GregorianCalendar date, int temp)
	{
		this.date = date;
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
