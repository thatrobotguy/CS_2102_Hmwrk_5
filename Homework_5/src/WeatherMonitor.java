import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherMonitor {
	// private LinkedList<DailyWeatherReport> dailyreports;
	private ISet dailyreports;
	// WeatherMonitor(LinkedList<DailyWeatherReport> dailyreports)
	WeatherMonitor(ISet dailyreports)
	{ this.dailyreports = dailyreports; }
	
	public int averageHighForMonth(int month, int year){		
		int elements = 0; int totalHigh = 0;
		for (DailyWeatherReport aReport : dailyreports)
		{
			if (aReport.inMonth(year, month))
			{
				elements++;	
				totalHigh += aReport.getHigh();				
			}
		}
		return totalHigh/elements;//holdrealreading.averageHigh();
	}

	public int averageLowForMonth(int month, int year){
<<<<<<< HEAD
		//holdrealreading = new LinkedList<Reading>();
		for (Reading aRead : this.readings)
		{
			if (aRead.inMonth(year, month))
=======
		int elements = 1; int totalLow = 0;
		for (DailyWeatherReport aReport : dailyreports)
		{			
			if (aReport.inMonth(year, month))
>>>>>>> branch 'master' of https://github.com/thatrobotguy/CS_2102_Hmwrk_5.git
			{
				totalLow += aReport.getLow();				
				elements++;	
			}
		}
		return totalLow/elements;//holdrealreading.averageHigh();
	}

	public void addDailyReport(GregorianCalendar date, LinkedList<Reading> readings){
		// assume that the list "readings" isn't empty
		int max = readings.get(0).getTemp(); int min = readings.get(0).getTemp();
		for (Reading aRead: readings)
		{			
			if (aRead.highTemp(max)){
				max = aRead.getTemp();
			}
			if (aRead.lowTemp(min)){
				min = aRead.getTemp();
			}			
		}
		dailyreports.add(new DailyWeatherReport(date,max,min));
	}		
}
