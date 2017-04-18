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
			if (arep.getDate().get(1) == aReport.getDate().get(1) && 
					arep.getDate().get(2) == aReport.getDate().get(2) && 
					arep.getDate().get(3)== aReport.getDate().get(3)&&
					arep.getDate().get(4) == aReport.getDate().get(4) && 
					arep.getDate().get(5)== aReport.getDate().get(5))
			{ return true;	} else return false;
		} return false;
	}

	public LinkedList<DailyWeatherReport> makeList(LinkedList<DailyWeatherReport> list) {
		return this.dailyreports;
	}

	public LinkedList<Reading> makeList1(LinkedList<Reading> list) {
		return list;
	}
}