import java.util.GregorianCalendar;
import java.util.LinkedList;

public interface ISet {
	//Andrew Schueler and Mary Hatfalvi
	public LinkedList<DailyWeatherReport> makeList(LinkedList<DailyWeatherReport> list);
	public ISet addElt(DailyWeatherReport dailyWeatherReport);
}
