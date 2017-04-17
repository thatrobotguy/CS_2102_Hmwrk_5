import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherMonitor {
	private LinkedList<DailyWeatherReport> dailyreports1;
	private ISet dailyreports;
	// WeatherMonitor(LinkedList<DailyWeatherReport> dailyreports)
	WeatherMonitor(ISet dailyreports)
	{ this.dailyreports = dailyreports; }
	public int averageHighForMonth(int month, int year){		
		int elements = 0; int totalHigh = 0;
		LinkedList<DailyWeatherReport> holder = new LinkedList<DailyWeatherReport>();
		//LinkedList<Integer> compute = new LinkedList<Integer>();
		dailyreports.makeList(holder);
		for (DailyWeatherReport aReport : holder)
		{			
			if (aReport.inMonth(year, month))
			{
				totalHigh += aReport.getHigh();				
				elements++;	
			}
		}
		return totalHigh/elements;//dailyreports.averageLowForMonth(month, year);
	}

	public int averageLowForMonth(int month, int year){
		int elements = 0; int totalLow = 0;
		LinkedList<DailyWeatherReport> holder = new LinkedList<DailyWeatherReport>();
		//LinkedList<Integer> compute = new LinkedList<Integer>();
		dailyreports.makeList(holder);
		for (DailyWeatherReport aReport : holder)
		{			
			if (aReport.inMonth(year, month))
			{
				totalLow += aReport.getLow();				
				elements++;	
			}
		}
		return totalLow/elements;//dailyreports.averageLowForMonth(month, year);
	}

	public void addDailyReport(GregorianCalendar date, LinkedList<Reading> readings){
		//LinkedList<Reading> read = new LinkedList<Reading>();
		//LinkedList<Reading> holder = new LinkedList<Reading>()
		//readings.makeList1(read);
		// assume that the list "readings" isn't empty
		int max =0; int min = 0;
		for (Reading s : readings){
			//if (!s.IsDayHourMin(date))
			//{
			//	holder.add(s);		
			if (s.highTemp(max))
			{
				max = s.getTemp();
			}
			if (s.lowTemp(min))
			{
				min = s.getTemp();
			}	
			//}		
		}
		/*for (Reading int max = dailyreports1.get(0).getTemp()aRead: s)
		{			
			if (aRead.highTemp(max)){
				max = aRead.getTemp();
			}
			if (aRead.lowTemp(min)){
				min = aRead.getTemp();
			}			
		}*/
		dailyreports.addElt(new DailyWeatherReport(date,max,min));
	}		

	public int average(LinkedList<Integer> list){
		int sum = 0;
		for (int a : list){
			sum += a;
		}
		return sum/list.size();

	}
}
