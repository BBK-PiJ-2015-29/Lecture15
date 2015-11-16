/**
 * JUnit Test class for Patient of ex 4
 * @author ocouls01
 */
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TestPatient {
	private GregorianCalendar currentDate;
	private GregorianCalendar dateOfBirth; 
	private Patient myPatient;
	private static final long MILLIS_IN_SECOND = 1000;
	private static final long SECONDS_IN_MINUTE = 60;
	private static final long MINUTES_IN_HOUR = 60;	
	private static final long HOURS_IN_DAY = 24;
	private static final long DAYS_IN_YEAR = 365;
	private static final long MILLIS_IN_YEAR = MILLIS_IN_SECOND * SECONDS_IN_MINUTE
		* MINUTES_IN_HOUR * HOURS_IN_DAY * DAYS_IN_YEAR;
	@Before
	public void SetUp() {
		currentDate = new GregorianCalendar();
		dateOfBirth = new GregorianCalendar(1986, 8, 28);
		myPatient = new PatientImpl("Dan", dateOfBirth);
		
	}
	
	@Test
	public void testGetAge() {
		long testAgeMilliseconds = currentDate.getTimeInMillis() - dateOfBirth.getTimeInMillis();
		int years  = (int)(testAgeMilliseconds/MILLIS_IN_YEAR);
		
		
		assertEquals(years, myPatient.getAge());
	}
}