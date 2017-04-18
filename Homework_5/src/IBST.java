import java.util.LinkedList;

public interface IBST extends ISet{
	// returns BST containing all existing elements and the given element
	IBST addElt(DailyWeatherReport elt);

	// returns the number of distinct elements in the BST
	int size();

	DailyWeatherReport getData();

	// determines whether given element is in the BST
	boolean hasElt(DailyWeatherReport elt);
}