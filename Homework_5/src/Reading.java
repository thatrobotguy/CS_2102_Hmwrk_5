
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Reading {

	private GregorianCalendar date;
	private int temp;
	
	Reading(GregorianCalendar date, int temp)
	{
		this.date = date; // the version with 5 arguments. maybe just 3?
		// a year, a month, a day of month, an hour, and a minute
		this.temp = temp;
	}
	//Reading()
	
	public boolean inMonth(int year, int month)
	{
		if (this.getDate().YEAR == year &&
				this.getDate().MONTH == month)
		{
			return true;
		} else return false;
	}
	
	public boolean inDay(int year, int month, int day)
	{
		if (this.inMonth(year, month))
		{
			if (this.getDate().DAY_OF_MONTH == day)
			{
				return true;
			} else return false;
		} else return false;
	}
	
	public GregorianCalendar getDate()
	{
		return this.date;
	}
	
	public int getTemp()
	{
		return this.temp;
	}

	public boolean HighTemp(int temp){
		if (temp < this.temp)
		return true;
		else
		return false;
	}
	public boolean LowTemp(int temp){
		if (temp > this.temp)
			return true;
		else
			return false;
	}
}

