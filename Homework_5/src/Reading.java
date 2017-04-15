import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Reading {

	private GregorianCalendar date;
	private int highTemp;
	private int lowTemp;
	
	Reading(GregorianCalendar date, int lowTemp, int highTemp)
	{
		this.date = date; // the version with 5 arguments. maybe just 3?
		// a year, a month, a day of month, an hour, and a minute
		this.lowTemp = lowTemp;
		this.highTemp = highTemp;
	}
	
	public boolean inMonth(int year, int month)
	{
		if (this.getDate().YEAR == year &&
				this.getDate().MONTH == month)
		{
			return true;
		} else return false;
	}
	
	public GregorianCalendar getDate()
	{
		return this.date;
	}
	
	public int getHighTemp()
	{
		return this.highTemp;
	}
	
	public int getLowTemp()
	{
		return this.lowTemp;
	}
}
