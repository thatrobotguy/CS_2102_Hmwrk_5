import static org.junit.Assert.*;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import org.junit.Test;

public class Examples {
	LinkedList<Reading> readings = new LinkedList<Reading>();
	LinkedList<DailyWeatherReport> test = new LinkedList<DailyWeatherReport>();
	ISet tester = new List();
	IBST tester2;
	ISet tester3 = tester2;
	WeatherMonitor weather = new WeatherMonitor(tester);
	WeatherMonitor weather2 = new WeatherMonitor(tester3);

	@Test
	public void test1() {	// Testing if averageHighForMonth works
		// Tests 1-3 use lists.
		readings.add(new Reading(8, 11, 30));
		readings.add(new Reading(9, 11, 45));
		readings.add(new Reading(12, 11, 60));
		readings.add(new Reading(10, 16, 50));
		readings.add(new Reading(1, 10, 67));
		readings.add(new Reading(9, 00, 50));
		weather.addDailyReport(new GregorianCalendar(2017, 4, 22), readings);
		assertEquals(67, weather.averageHighForMonth(4, 2017));
	}

	@Test
	public void test2(){ // Same test but finding the low instead
		readings.add(new Reading(8, 11, 30));
		readings.add(new Reading(9, 11, 45));
		readings.add(new Reading(12, 11, 60));
		readings.add(new Reading(10, 16, 50));
		readings.add(new Reading(1, 10, 67));
		readings.add(new Reading(9, 00, 50));
		//test.add(new DailyWeatherReport(new GregorianCalendar(2017, 4, 22), 67, 30));
		weather.addDailyReport(new GregorianCalendar(2017, 4, 22), readings);
		assertEquals(30, weather.averageLowForMonth(4, 2017));
	}
	@Test
	public void test3() { // Same as 1st except 2 different months
		readings.add(new Reading(8, 11, 20));
		readings.add(new Reading(9, 11, 45));
		readings.add(new Reading(12, 11, 60));
		readings.add(new Reading(10, 16, 70));
		readings.add(new Reading(1, 10, 67));
		readings.add(new Reading(9, 00, 50));
		//test.add(new DailyWeatherReport(new GregorianCalendar(2017, 4, 22), 67, 30));
		weather.addDailyReport(new GregorianCalendar(2017, 4, 22), readings);
		readings.add(new Reading(1, 10, 67));
		readings.add(new Reading(9, 00, 50));
		weather.addDailyReport(new GregorianCalendar(2017, 5, 22), readings);		
		assertEquals(70, weather.averageHighForMonth(4, 2017));
	}
	@Test
	public void test4(){// Same as 3rd except averageLow and IBST is used.
		readings.add(new Reading(8, 11, 22));
		readings.add(new Reading(9, 11, 45));
		readings.add(new Reading(12, 11, 60));
		readings.add(new Reading(10, 16, 50));
		readings.add(new Reading(1, 10, 67));
		readings.add(new Reading(9, 00, 50));
		//test.add(new DailyWeatherReport(new GregorianCalendar(2017, 4, 22), 67, 30));
		weather2.addDailyReport(new GregorianCalendar(2017, 4, 22), readings);
		readings.add(new Reading(1, 10, 21));
		readings.add(new Reading(9, 00, 50));
		weather2.addDailyReport(new GregorianCalendar(2017, 5, 22), readings);		
		assertEquals(22, weather2.averageLowForMonth(4, 2017));
	}

	@Test
	public void test5(){ // This tests with an IBST and 
		readings.add(new Reading(8, 11, 22));
		readings.add(new Reading(9, 11, 45));
		readings.add(new Reading(12, 11, 60));
		readings.add(new Reading(10, 16, 50));
		readings.add(new Reading(1, 10, 67));
		readings.add(new Reading(9, 00, 50));
		weather2.addDailyReport(new GregorianCalendar(2014, 4, 22), readings);
		readings.add(new Reading(1, 10, 21));
		readings.add(new Reading(9, 00, 50));
		readings.add(new Reading(10, 10, 21));
		readings.add(new Reading(5, 4, 100));
		weather2.addDailyReport(new GregorianCalendar(2014, 5, 22), readings);	
		readings.add(new Reading(6, 30, 21));
		readings.add(new Reading(6, 00, 50));
		readings.add(new Reading(1, 59, 21));
		readings.add(new Reading(4, 40, 10));
		weather2.addDailyReport(new GregorianCalendar(2014, 5, 27), readings);		
		assertEquals(16, weather2.averageLowForMonth(5, 2014));
	}
}
