import java.util.GregorianCalendar;
import java.util.LinkedList;
//Andrew Schueler and Mary Hatfalvi
public class EmptyBST implements IBST {
	// holder of empty data
	private DailyWeatherReport data;

	EmptyBST() {
	}

	// returns the number of distinct elements in the BST
	public int size() {
		return 0;
	}

	// returns BST containing all existing elements and the given element
	public IBST addElt(DailyWeatherReport elt) {
		//this.data = elt;
		return new DataBST(elt, new EmptyBST(), new EmptyBST());
	}

	// determines whether the given element is in the BST
	public boolean hasElt(DailyWeatherReport elt) {
		return false;
	}

	// Get the data
	public DailyWeatherReport getData() {
		return this.data;
	}
	// return already made list
	public LinkedList<DailyWeatherReport> 
	makeList(LinkedList<DailyWeatherReport> list) {
		return list;
	}
}
