/**
 * Patient class of exercise 4
 * @author ocouls01
 */
import java.util.GregorianCalendar;

public class PatientImpl implements Patient {
	private String name;
	private GregorianCalendar dob;
	
	private static final long MILLIS_IN_SECOND = 1000;
	private static final long SECONDS_IN_MINUTE = 60;
	private static final long MINUTES_IN_HOUR = 60;	
	private static final long HOURS_IN_DAY = 24;
	private static final long DAYS_IN_YEAR = 365;
	private static final long MILLIS_IN_YEAR = MILLIS_IN_SECOND * SECONDS_IN_MINUTE
		* MINUTES_IN_HOUR * HOURS_IN_DAY * DAYS_IN_YEAR;
	
	public PatientImpl(String name, GregorianCalendar dob) {
		this.name = name;
		this.dob = dob;

		if ((this.getAge() < 0) || (this.getAge() > 130)) {

			throw new IllegalArgumentException();

		}
	}
	
	public int getAge() {
		GregorianCalendar current = new GregorianCalendar();
		long ageMillis = current.getTimeInMillis() - dob.getTimeInMillis();
		if(ageMillis < 0) {
			return -1;
		} 
		int age = (int)(ageMillis / MILLIS_IN_YEAR);
	
		return age;
	}

	public String getName() {
		return this.name;
	}
}
