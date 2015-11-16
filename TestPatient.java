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
	
	@Before
	public void SetUp() {
		currentDate = new GregorianCalendar();
		dateOfBirth = new GregorianCalendar(1986, 8, 28);
		myPatient = new PatientImpl("Dan", dateOfBirth);
	}

	@Test
	public void testCreate() {
		assertNotNull(myPatient);

		String name = myPatient.getName();
		assertEquals("Dan", name);

		int age = myPatient.getAge();
		assertEquals(29, age);
	}
	

	@Test (expected = IllegalArgumentException.class)
	public void testCreateForInvalidAgeFutureDOB() {
		Patient futureDateOfBirth = new PatientImpl("Harry", new GregorianCalendar(2016, 12, 8));
	
	}

	@Test (expected = IllegalArgumentException.class)
	public void testCreateForInvalidAgeOlderThan130() {
		Patient olderThan130 = new PatientImpl("Harry", new GregorianCalendar(1870, 12, 8));
		
	}

}