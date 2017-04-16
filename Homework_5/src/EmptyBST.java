import java.util.GregorianCalendar;
import java.util.LinkedList;

public class EmptyBST implements IBST {
	EmptyBST() {
	}

	// returns the number of distinct elements in the BST
	public int size() {
		return 0;
	}

	// returns BST containing all existing elements and the given element
	public IBST addElt(DailyWeatherReport elt) {
		return new DataBST(elt, new EmptyBST(), new EmptyBST());
	}

	// determines whether the given element is in the BST
	public boolean hasElt(DailyWeatherReport elt) {
		return false;
	}

	public int averageHighForMonth(int month, int year) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int averageLowForMonth(int month, int year) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void addDailyReport(GregorianCalendar date, LinkedList<Reading> readings) {
		
	}

	public LinkedList<DailyWeatherReport> makeList() {
		// TODO Auto-generated method stub
		return new LinkedList<DailyWeatherReport>();
	}

	public DailyWeatherReport getData() {
		// TODO Aut;o-generated method stub
		return null;
	}


	public int addHigh(int year, int month) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int addLow(int year, int month) {
		// TODO Auto-generated method stub
		return 0;
	}
}
