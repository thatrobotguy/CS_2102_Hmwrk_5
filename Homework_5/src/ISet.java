import java.util.GregorianCalendar;
import java.util.LinkedList;

public interface ISet {
	public LinkedList<DailyWeatherReport> makeList(LinkedList<DailyWeatherReport> list);
	public ISet addElt(DailyWeatherReport dailyWeatherReport);
}
