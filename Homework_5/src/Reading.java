
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Reading {
	//Andrew Schueler and Mary Hatfalvi
	private int hour;
	private int minute;
	private int temp;
	// constructor
	Reading(int hour, int minute, int temp)
	{
		this.hour = hour;
		this.minute = minute;
		this.temp = temp;
	}
	// return hour
	public int getHour() {
		return this.hour;
	}
	// return minute
	public int getMinute() {
		return this.minute;
	}
	// return temperature
	public int getTemp() {
		return this.temp;
	}
	// check temp reading for if it is a high temperature return high
	public int highTemp(int max)
	{
		if (this.getTemp() >= max)
			return this.getTemp();
		else 
			return max;
	}
	// check temp reading if it low temp return lowest
	public int lowTemp(int low)
	{
		if (this.getTemp() <= low)
			return this.getTemp();
		else
			return low;
	}
}

