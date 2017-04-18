import java.util.GregorianCalendar;
import java.util.LinkedList;

public class List implements ISet {
	private LinkedList<DailyWeatherReport> dailyreports = new LinkedList<DailyWeatherReport>();

	List() {
	}
	public LinkedList<DailyWeatherReport> getList(){
		return this.dailyreports;
	}
	public int size() {
		return dailyreports.size();
	}

	public ISet addElt(DailyWeatherReport elt) {
		if (this.hasElt(elt))
		{
			return this;
		}
		else 
		{
			dailyreports.add(elt);
			return this;
		}		
	}

	public boolean hasElt(DailyWeatherReport aReport) {
		for (DailyWeatherReport arep: this.dailyreports)
		{
			if (arep.getDate().YEAR == aReport.getDate().YEAR && 
					arep.getDate().MONTH == aReport.getDate().MONTH && 
					arep.getDate().DAY_OF_MONTH == aReport.getDate().DAY_OF_MONTH &&
					arep.getDate().HOUR == aReport.getDate().HOUR && 
					arep.getDate().MINUTE == aReport.getDate().MINUTE)
			{ return true;	} else return false;
		} return false;
	}

	public LinkedList<DailyWeatherReport> makeList(LinkedList<DailyWeatherReport> list) {
		return this.dailyreports;
	}

	public LinkedList<Reading> makeList1(LinkedList<Reading> list) {
		// TODO Auto-generated method stub
		return list;
	}


}
