import java.util.GregorianCalendar;
import java.util.LinkedList;

public class DataBST implements IBST {
	DailyWeatherReport data;
	IBST left;
	IBST right;
	private LinkedList<Integer> hold = new LinkedList<Integer>();
	private int counter = 0;


	DataBST(DailyWeatherReport data, IBST left, IBST right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	// returns the number of distinct elements in the BST
	public int size() {
		return 1 + this.left.size() + this.right.size();
	}

	// returns BST containing all existing elements and the given element
	public IBST addElt(DailyWeatherReport elt) {
		if (elt.getDate().equals(this.data.getDate()))
			return this; // not storing duplicate values
		else if (elt.getLow()<this.data.getLow())//if this data low is smaller than the 
			//data code then put on left side else put on right side. elt.compareTo(this.data) < 0)
			return new DataBST(this.data, this.left.addElt(elt), this.right);
		else return new DataBST(this.data, this.left, this.right.addElt(elt)); // elt > this.data
	}

	// determines whether the given element is in the BST
	public boolean hasElt(DailyWeatherReport elt) {
		if (elt.equals(this.data))
			return true;
		else if (elt.getLow()<this.data.getLow())
			return this.left.hasElt(elt);
		else // elt > this.data
			return this.right.hasElt(elt);
	}

	public int averageHighForMonth(int month, int year) {
		counter = 0;
		//LinkedList<Integer> hold = new LinkedList<Integer>();
		//int elements = this.size();//  int totalHigh = 0;
			//if(this.data.inMonth(year, month)){
			//	hold.add(this.data.getHigh());
			//}
			//else if(this.left.)
			// if (this.left.getData().;
		//for (DailyWeatherReport aReport: this)
		//{
			
		//}
		int elt = this.addHigh(year, month);
		int elements = counter;
		counter = 0;
		return elt/elements;
	}

	public DailyWeatherReport getData()
	{
		return this.data;
	}
	
	public int addHigh(int year, int month)
	{
		if (this.data.inMonth(year, month))
		{	counter++;
			return this.data.getHigh() + this.left.addHigh(year, month) + this.right.addHigh(year, month);
		} else { counter++; return this.left.addHigh(year, month) + this.right.addHigh(year, month);}	
	}
	public int addLow(int year, int month)
	{
		if (this.data.inMonth(year, month))
		{	counter++;
			return this.data.getLow() + this.left.addLow(year, month) + this.right.addLow(year, month);
		} else { counter++; return this.left.addLow(year, month) + this.right.addLow(year, month);}	
	}
	
	public int averageLowForMonth(int month, int year) {
		counter = 0;
		//LinkedList<Integer> hold = new LinkedList<Integer>();
		//int elements = this.size();//  int totalHigh = 0;
			//if(this.data.inMonth(year, month)){
			//	hold.add(this.data.getHigh());
			//}
			//else if(this.left.)
			// if (this.left.getData().;
		//for (DailyWeatherReport aReport: this)
		//{
			
		//}
		int elt = this.addLow(year, month);
		int elements = counter;
		counter = 0;
		return elt/elements;
	}

	public void addDailyReport(GregorianCalendar date, LinkedList<Reading> readings) {
		// TODO Auto-generated method stub
		
	}

	public LinkedList<DailyWeatherReport> makeList() {
		// TODO Auto-generated method stub
		return null;
	}
}