import java.util.LinkedList;

public interface IBST extends ISet{
	//Andrew Schueler and Mary Hatfalvi
	// returns BST containing all existing elements and the given element
	IBST addElt(DailyWeatherReport elt);

	// returns the number of distinct elements in the BST
	int size();

	// Get the data
	DailyWeatherReport getData();

	// determines whether given element is in the BST
	boolean hasElt(DailyWeatherReport elt);
}