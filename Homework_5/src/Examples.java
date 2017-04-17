import static org.junit.Assert.*;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import org.junit.Test;

public class Examples {
	LinkedList<Reading> readings = new LinkedList<Reading>();
	LinkedList<DailyWeatherReport> test = new LinkedList<DailyWeatherReport>();
	ISet tester = new List();
	WeatherMonitor weather = new WeatherMonitor(tester);
	
	@Test
	public void test1() {
		readings.add(new Reading(8, 11, 30));
		readings.add(new Reading(9, 11, 45));
		readings.add(new Reading(12, 11, 60));
		readings.add(new Reading(10, 16, 50));
		readings.add(new Reading(1, 10, 67));
		readings.add(new Reading(9, 00, 50));
		//test.add(new DailyWeatherReport(new GregorianCalendar(2017, 4, 22), 67, 30));
		weather.addDailyReport(new GregorianCalendar(2017, 4, 22), readings);
		assertEquals(67, weather.averageHighForMonth(2017, 4));
	}
	
	@Test
	public void test2(){
		readings.add(new Reading(8, 11, 30));
		readings.add(new Reading(9, 11, 45));
		readings.add(new Reading(12, 11, 60));
		readings.add(new Reading(10, 16, 50));
		readings.add(new Reading(1, 10, 67));
		readings.add(new Reading(9, 00, 50));
		//test.add(new DailyWeatherReport(new GregorianCalendar(2017, 4, 22), 67, 30));
		weather.addDailyReport(new GregorianCalendar(2017, 4, 22), readings);
		assertEquals(30, weather.averageLowForMonth(2017, 4));
	}

}
