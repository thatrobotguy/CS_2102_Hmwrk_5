import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherMonitor {
	private LinkedList<DailyWeatherReport> dailyreports1;
	private ISet dailyreports;
	// WeatherMonitor(LinkedList<DailyWeatherReport> dailyreports)
	WeatherMonitor(ISet dailyreports)
	{ this.dailyreports = dailyreports; }
	public int averageHighForMonth(int year, int month){		
		int elements = 0; int totalHigh = 0;
		LinkedList<DailyWeatherReport> holder = new LinkedList<DailyWeatherReport>();
		//LinkedList<Integer> compute = new LinkedList<Integer>();
		holder = dailyreports.makeList(holder);
		for (DailyWeatherReport aReport : holder)
		{			
			if (aReport.inMonth(year, month))
			{
				totalHigh += aReport.getHigh();				
				elements++;	
			}
		}
		if (elements == 0){return 0;}
		else
		return totalHigh/elements;//dailyreports.averageLowForMonth(month, year);
	}

	public int averageLowForMonth(int month, int year){
		int elements = 0; int totalLow = 0;
		LinkedList<DailyWeatherReport> holder = new LinkedList<DailyWeatherReport>();
		//LinkedList<Integer> compute = new LinkedList<Integer>();
		holder = dailyreports.makeList(holder);
		for (DailyWeatherReport aReport : holder)
		{			
			if (aReport.inMonth(month, year))
			{
				totalLow += aReport.getLow();				
				elements++;	
			}
		}
		if (elements == 0){return 0;}
		else
		return totalLow/elements;//dailyreports.averageLowForMonth(month, year);
	}

	public void addDailyReport(GregorianCalendar date, LinkedList<Reading> readings){
		//LinkedList<Reading> read = new LinkedList<Reading>();
		//LinkedList<Reading> holder = new LinkedList<Reading>()
		//readings.makeList1(read);
		// assume that the list "readings" isn't empty
		int max = readings.get(0).getTemp(); int min = readings.get(0).getTemp();
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
		if (dailyreports == null)
			dailyreports = new DataBST(new DailyWeatherReport(date,max,min));
		else
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
