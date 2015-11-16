/**
 * Interface for Patient class
 * @author ocouls01
 */
public interface Patient {
	/**
	 * A method which calculates the current age by 
	 * comparing the DOB with the current date;
	 * 
	 * @return age as an int in years.
	 */
	int getAge();

	/**
	 * Returns the patient's name
	 * 
	 * @return the patient's name as a String
	 */
	String getName();
}