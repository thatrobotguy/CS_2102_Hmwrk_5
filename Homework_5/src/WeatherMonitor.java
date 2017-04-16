import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherMonitor {
	private LinkedList<DailyWeatherReport> dailyreports;
	WeatherMonitor(LinkedList<DailyWeatherReport> dailyreports)
	{ this.dailyreports = dailyreports; }
	
	public int averageHighForMonth(int month, int year){		
		int counter = 1;
		for (DailyWeatherReport aReport : dailyreports)
		{			
				//holdrealreading.add(aRead.averageHigh(year, month, counter));				
				counter++;			
		}
		return 0;//holdrealreading.averageHigh();
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
		return 0;//holdrealreading.averageLow();
	}

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