import java.util.GregorianCalendar;
import java.util.LinkedList;
//Andrew Schueler and Mary Hatfalvi
public class WeatherMonitor {
	// private ISet
	private ISet dailyreports;
	// constructor 
	WeatherMonitor(ISet dailyreports)
	{ this.dailyreports = dailyreports; }

	// takes in 2 ints of a year and month and returns the average high temp
	//for that month 
	public int averageHighForMonth(int month, int year){		
		int elements = 0; int totalHigh = 0;
		// list holder that is used to convert data from any data structure
		LinkedList<DailyWeatherReport> holder = new LinkedList<DailyWeatherReport>();
		// make a linked list from data
		holder = computelist(month, year);
		for (DailyWeatherReport aReport : holder)
		{		
			//add the high to total high
			totalHigh += aReport.getHigh();				
			elements++;	//  increment elements 
		}
		if (elements == 0){return 0;}// if there is no data for that month return 0
		else // else return the average high temp
			return totalHigh/elements;
	}

	// takes in 2 ints of a year and month and returns the average low temp
	//for that month 
	public int averageLowForMonth(int month, int year){
		int elements = 0; int totalLow = 0;
		// list holder that is used to convert data from any data structure
		LinkedList<DailyWeatherReport> holder = new LinkedList<DailyWeatherReport>();
		// make a linked list from data
		holder = computelist(month, year);
		for (DailyWeatherReport aReport : holder)
		{		//add the low to total low
			totalLow += aReport.getLow();				
			elements++;	//  increment elements 

		}
		if (elements == 0){return 0;}// if there is no data for that month return 0
		else
			return totalLow/elements;// else return the average low temp
	}

	public void addDailyReport(GregorianCalendar date, LinkedList<Reading> readings){
		// assume that the list "readings" isn't empty
		// Initialize max and min temperatures to first element
		int max = readings.get(0).getTemp(); int min = readings.get(0).getTemp();
		for (Reading s : readings){	
			// for each reading find the highest and lowest temp and store them 
			max = s.highTemp(max);
			min = s.lowTemp(min);
		}
		if (dailyreports == null)// if daily reports has no data set then default to data
			// BST
			dailyreports = new DataBST(new DailyWeatherReport(date,max,min));
		else// else add element to whatever data structure created
			dailyreports = dailyreports.addElt(new DailyWeatherReport(date,max,min));
	}		

	// helper function for finding daily reports only for a certain month and year 
	private LinkedList<DailyWeatherReport> computelist(int month, int year){
		LinkedList<DailyWeatherReport> holder = new LinkedList<DailyWeatherReport>();
		LinkedList<DailyWeatherReport> holder2 = new LinkedList<DailyWeatherReport>();
		// make a linked list from data
		holder = dailyreports.makeList(holder);
		for (DailyWeatherReport aReport : holder)
		{	// for every dailyweatherreport check if it is within the same month and year		
			if (aReport.inMonth(month, year))
			{	// if yes then add to new list
				holder2.add(aReport);
			}
		}
		return holder2;
	}
}
