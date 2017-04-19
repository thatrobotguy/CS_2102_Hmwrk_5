import java.util.GregorianCalendar;
import java.util.LinkedList;
//Andrew Schueler and Mary Hatfalvi
public class DailyWeatherReport {
	// declare private variables 
	private GregorianCalendar date;
	private int hightemp;
	private int lowtemp;
	// constructor
	public DailyWeatherReport(GregorianCalendar date, int hightemp,int lowtemp){
		this.date = date;
		this.hightemp = hightemp;
		this.lowtemp = lowtemp;
	}
	// function that checks if dates are in same year and month 
	public boolean inMonth(int month, int year)
	{
		return year == this.date.get(1) && month == this.date.get(2);
	}
	// gets the high temp for addition of average high
	public int getHigh(){
		return this.hightemp;
	}
	// gets low for addition of average low
	public int getLow(){
		return this.lowtemp;
	}
	// gets date 
	public GregorianCalendar getDate(){
		return this.date;
	}
}
