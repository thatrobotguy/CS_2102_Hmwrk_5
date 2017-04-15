import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherMonitor {
	
	/*
	The weather data you are tracking is initially gathered from 
	a weather sensor that produces readings containing
	1. time of the reading (hour and minute, both ints) 
	2. temperature in degrees Fahrenheit (use an int).
	Because the volume of readings is so high, your weather monitor will store 
	only the date (use the Java class GregorianCalendar, see 
	description below) and two temperature readings:
	1. lowest temperature of the day
	2. highest temperature of the day.
	To manage the daily weather data, your WeatherMonitor must also 
	provide a method addDailyReport that consumes a date and a list 
	of readings (nominally for that date) and stores a daily report 
	for the given date (computing the high and low temperature 
	readings from the given list of readings for that date). 
	For Part 1 of this assignment, the WeatherMonitor's daily reports 
	should be stored in a LinkedList.
	*/
	private LinkedList<Reading> readings;
	
	public WeatherMonitor(LinkedList<Reading> readings)
	{
		this.readings = readings;
	}
	
	public int averageHighForMonth(int month, int year){
		int day = 1;
		// GregorianCalendar testday = new GregorianCalendar(year, month, day);
		for (day = 1; day < this.readings.size(); day++) // (Reading aread : this.readings)
		{
			
		}
		return 0;
	}
	
	public int averageLowForMonth(int month, int year){
		
		return 0;
	}
	
	private Reading getHigh()
	{
		int highTemp = this.readings.get(0).getTemp();
		Reading testRead = new Reading(this.readings.get(0).getReadingDate(), 
				this.readings.get(0).getTemp());
		for (Reading aread : this.readings)
		{
			if (aread.getTemp() > highTemp)
			{
				highTemp = aread.getTemp();
				testRead = aread;
			}
		}
		return 
	}
	
	private static int daysInMonth()
	{
		return 0;
	}
}