import java.util.GregorianCalendar;
import java.util.LinkedList;

public class List implements ISet {
	private LinkedList<DailyWeatherReport> dailyreports;

	List() {
	}

	public int size() {
		return dailyreports.size();
	}

	public ISet addElt(DailyWeatherReport elt) {
		dailyreports.add(elt);
		return this;
	}

	public boolean hasElt(String elt) {
		return dailyreports.contains(elt);
	}
/*
	public int averageHighForMonth(int month, int year) {
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

	public int averageLowForMonth(int month, int year) {
		int elements = 0; int totalLow = 0;
		for (DailyWeatherReport aReport : dailyreports)
		{			
			if (aReport.inMonth(year, month))
			{
				elements++;
				totalLow += aReport.getLow();				
			}
		}
		return totalLow/elements;
	}
*/
	public void addDailyReport(GregorianCalendar date, LinkedList<Reading> readings) {
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

	public LinkedList<DailyWeatherReport> makeList(LinkedList<DailyWeatherReport> list) {
		return this.dailyreports;
	}

	public LinkedList<Reading> makeList1(LinkedList<Reading> list) {
		// TODO Auto-generated method stub
		return list;
	}


}
