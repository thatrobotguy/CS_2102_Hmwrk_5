import java.util.GregorianCalendar;
import java.util.LinkedList;
//Andrew Schueler and Mary Hatfalvi
public class DataBST implements IBST {
	// declare variables
	private DailyWeatherReport data;
	private IBST left;
	private IBST right;
	// constructor
	DataBST(DailyWeatherReport data, IBST left, IBST right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	// override constructor
	DataBST(DailyWeatherReport data) {
		this.data = data;
		this.left = new EmptyBST();
		this.right = new EmptyBST();
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

	// Get the data
	public DailyWeatherReport getData()
	{
		return this.data;
	}

	// Convert to list.
	public LinkedList<DailyWeatherReport> makeList(LinkedList<DailyWeatherReport> list) {
		list.add(this.getData());
		left.makeList(list);
		right.makeList(list);	
		return list;
	}
}