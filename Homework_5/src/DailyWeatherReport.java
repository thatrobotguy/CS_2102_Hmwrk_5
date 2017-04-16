import java.util.GregorianCalendar;
import java.util.LinkedList;

public class DailyWeatherReport {
	private GregorianCalendar date;
	private int hightemp;
	private int lowtemp;
	
	public DailyWeatherReport(GregorianCalendar date,int hightemp,int lowtemp){
		this.date = date;
		this.hightemp = hightemp;
		this.lowtemp = lowtemp;
	}
	
	public int getHigh(){
		return this.hightemp;
	}
	
	public int getLow(){
		return this.lowtemp;
	}
	
	public GregorianCalendar getDate(){
		return this.date;
	}
}
