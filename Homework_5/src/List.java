import java.util.GregorianCalendar;
import java.util.LinkedList;

public class List implements ISet {
	//Andrew Schueler and Mary Hatfalvi
	private LinkedList<DailyWeatherReport> dailyreports;
	//constructor
	List() {
		dailyreports = new LinkedList<DailyWeatherReport>();
	}
	// returns size 
	public int size() {
		return dailyreports.size();
	}
	// adds data to list
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
	// checks for repeated data
	public boolean hasElt(DailyWeatherReport aReport) {
		for (DailyWeatherReport arep: this.dailyreports)
		{	// if everything is equal return true else there is no repeated data
			if (arep.getDate().get(1) == aReport.getDate().get(1) && 
					arep.getDate().get(2) == aReport.getDate().get(2) && 
					arep.getDate().get(3)== aReport.getDate().get(3)&&
					arep.getDate().get(4) == aReport.getDate().get(4) && 
					arep.getDate().get(5)== aReport.getDate().get(5))
			{ return true;	} else return false;
		} return false;
	}
	// returns made list
	public LinkedList<DailyWeatherReport> makeList(LinkedList<DailyWeatherReport> list) {
		return this.dailyreports;
	}
}