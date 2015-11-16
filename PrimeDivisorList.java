/**
 * Interface for the PrimeDivisorList class
 * Lecture 15 - Ex 5
 * @author ocouls01
 */
public interface PrimeDivisorList {
	/**
	 * Returns the number of elements currently in the list
	 * @return the size as an int
	 */
	int getSize();

	/**
	 * Adds an Integer element to the list
	 * @param input The Integer element to be added
	 */
	void add(Integer input);

	/**
	 * Returns an element at a given place in the list,
	 * without deleting it.
	 * If the index is out of bounds it returns a null.
	 *
	 * @return the element at the given index or null.
	 * @param index the position of the element in the list
	 */
	Integer get(int index);

	/**
	 * Returns an element at a given place in the list,
	 * removing it from the list
	 *
	 * @return the element at the given index
	 * @param index the position of the element in the list
	 */
	Integer remove(int index);

	/**
	 * Overrides the toString method to print the list
	 */
	@Override
	String toString();
}