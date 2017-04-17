
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
		return this.hour;
	}

	public int getMinute() {
		return this.minute;
	}

	public int getTemp() {
		return this.temp;
	}
	
	public boolean highTemp(int max)
	{
		return (this.getTemp() >= max);
	}
	
	public boolean lowTemp(int low)
	{
		return (this.getTemp() <= low);
	}
	public boolean IsDayHourMin(GregorianCalendar date){
		return this.hour == date.HOUR && this.minute == date.MINUTE;
	}
}

