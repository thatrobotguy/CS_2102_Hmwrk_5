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
	private LinkedList<Reading> holdrealreading;
	
	WeatherMonitor(LinkedList<Reading> readings)
	// This is the constructor
	{
		this.readings = readings;
	}
	
	public int averageHighForMonth(int month, int year){		
		holdrealreading = new LinkedList<Reading>();		
		for (Reading aRead : this.readings)
		{
			if (aRead.inMonth(year, month))
			{
				holdrealreading.add(aRead);				
			}
		}
		return averageHigh();
	}
	
	public int averageLowForMonth(int month, int year){
		holdrealreading = new LinkedList<Reading>();
		for (Reading aRead : this.readings)
		{
			if (aRead.inMonth(year, month))
			{
				holdrealreading.add(aRead);				
			}
		}		
		return averageLow();
	}
	
	private int averageLow() // This gets the hig
	{
		int elements = 0, totalLows = 0;
		for (Reading aread : holdrealreading) {
			totalLows += aread.getLowTemp();
			elements++;
		}
		holdrealreading = null;
		return totalLows/elements;
	}
	
	private int averageHigh() // This gets the hig
	{
		int elements = 0, totalHighs = 0;		
		for (Reading aread : holdrealreading) {
			totalHighs += aread.getHighTemp();
			elements++;
		}
		holdrealreading = null;
		return totalHighs/elements;
	}
}