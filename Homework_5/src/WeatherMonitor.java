import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherMonitor {
	private LinkedList<DailyWeatherReport> dailyreports;
	WeatherMonitor(LinkedList<DailyWeatherReport> dailyreports)
	{ this.dailyreports = dailyreports; }
	
	public int averageHighForMonth(int month, int year){		
		int elements = 1; int totalHigh = 0;
		for (DailyWeatherReport aReport : dailyreports)
		{			
			if (aReport.inMonth(year, month))
			{
				totalHigh += aReport.getHigh();				
				elements++;	
			}
		}
		return totalHigh/elements;//holdrealreading.averageHigh();
	}

	public int averageLowForMonth(int month, int year){
		int elements = 1; int totalLow = 0;
		for (DailyWeatherReport aReport : dailyreports)
		{			
			if (aReport.inMonth(year, month))
			{
				totalLow += aReport.getLow();				
				elements++;	
			}
		}
		return totalLow/elements;//holdrealreading.averageHigh();
	}

	/*
	private int averageLow(int day) // This gets the hig
	{   int elements = 0, totalLows = 0;
	for (Reading aread : holdrealreading){
		totalLows += aread.getTemp();
		elements++;	}
	holdrealreading = null;
	return totalLows/elements;
	}

	private int averageHigh(int year, int month, int day) // This gets the hig
	{
		LinkedList<Reading> holdrealreading;
		int elements = 0, totalHighs = 0;  	
		for (Reading aread : holdrealreading) {
			if (aread.inDay(year, month, day))
			{
				totalHighs += aread.getTemp();
				elements++;
			}	
		}
		holdrealreading = null;
		return totalHighs/elements;
	}
	*/

	public void addDailyReport(GregorianCalendar date, LinkedList<Reading> readings){
		// assume that the list "readings" isn't empty
		int max = readings.get(0).getTemp(); int min = readings.get(0).getTemp();
		for (Reading aRead: readings)
		{
			if (aRead.highTemp(max)){
				max = aRead.getTemp();
			}
			else if (aRead.lowTemp(min)){
				min = aRead.getTemp();
			}			
		}
		dailyreports.add(new DailyWeatherReport(date,max,min));
	}		
}