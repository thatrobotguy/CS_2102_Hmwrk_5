
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Reading {
	private int hour;
	private int minute;
	private int temp;
	Reading(int hour, int minute, int temp)
	{
		this.hour = hour;
		this.minute = minute;
		this.temp = temp;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getTemp() {
		return temp;
	}
	
	public boolean highTemp(int max)
	{
		if (this.getTemp() >= max){return true;} else return false;
	}
	
	public boolean lowTemp(int low)
	{
		if (this.getTemp() <= low){return true;} else return false;
	}
}

