import java.util.GregorianCalendar;
import java.util.LinkedList;

public interface ISet {
	//public int averageHighForMonth(int month, int year);
	//public int averageLowForMonth(int month, int year);
	public void addDailyReport(GregorianCalendar date, LinkedList<Reading> readings);
	public LinkedList<DailyWeatherReport> makeList(LinkedList<DailyWeatherReport> list);
	//public LinkedList<Reading> makeList1(LinkedList<Reading> list);
	public void addElt(DailyWeatherReport dailyWeatherReport);
	
}
