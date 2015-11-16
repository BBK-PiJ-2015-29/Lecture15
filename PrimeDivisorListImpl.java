/**
 * Implementation of PrimeDivisorList interface
 * Lecture 15 - Ex 5
 * @author ocouls01
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class PrimeDivisorListImpl implements PrimeDivisorList{

	private List<Integer> internalList;

	public PrimeDivisorListImpl() {
		internalList = new ArrayList<Integer>();
	}

	/**
	 * Returns the number of elements currently in the list
	 * @return the size as an int
	 */
	public int getSize() {
		return internalList.size();
	}

	/**
	 * Adds an Integer element to the list
	 * @param input The Integer element to be added
	 */
	public void add(Integer input) {
		if (input == null) {
			throw new NullPointerException();
		}
		if (input < 1) {
			throw new IllegalArgumentException();
		} else if ((input == 1) || (input == 2)) {
			internalList.add(input);
			return;
		}


		boolean prime = true;
		for (int i = 2; i < input; i++) {
			if ((input % i) == 0) {
				prime = false;
				break;
			}
		}

		if (!prime) {
			throw new IllegalArgumentException();
		} else {
			internalList.add(input);
		}
	}

	/**
	 * Returns an element at a given place in the list,
	 * without deleting it.
	 * If the index is out of bounds it returns a null.
	 *
	 * @return the element at the given index or null.
	 * @param index the position of the element in the list
	 */
	public Integer get(int index) {
		try {
			return internalList.get(index);
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Not a valid index");
			return null;
		}
	}

	/**
	 * Returns an element at a given place in the list,
	 * removing it from the list
	 *
	 * @return the element at the given index
	 * @param index the position of the element in the list
	 */
	public Integer remove(int index) {
		try {
			return internalList.remove(index);
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Not a valid index");
			return null;
		}
	}

	/**
	 * Overrides the toString method to print the list
	 */
	@Override
	public String toString() {
		Object[] listArray = internalList.toArray();
		List<Integer> listCopy = new ArrayList<Integer>();
		for (int i = 0; i < listArray.length; i++){
			listCopy.add(Integer.parseInt(listArray[i].toString()));
		}
		Collections.sort(listCopy);
		String output = "";
		int count = 1;
		int total = 0;
		int temp = 0;
		for (int i = 0; i < listCopy.size(); i++) {
			temp = listCopy.get(i);
			total += listCopy.get(i);
			if (i < (listCopy.size() -1)) {
				if (listCopy.get(i+1).equals(listCopy.get(i))) {
					count++;
					continue;
				}
			}
			if (count > 1) {
				output += temp + "^" + count + " + ";
			} else if  (i == (listCopy.size()-1)) {
				output += temp;
			} else {
				output += temp + " + ";
			}

		}

		output += " = " + total;
		return output;
	}
}
