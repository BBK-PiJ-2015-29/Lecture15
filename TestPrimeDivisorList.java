/**
 * JUnit Tests for the PrimeDivisorList interface and class
 * Lecture 15 - Ex 5
 * @author ocouls01
 */
import org.junit.*;
import static org.junit.Assert.*;

public class TestPrimeDivisorList {
	private PrimeDivisorList myList;

	@Before
	public void setUp() {
		myList = new PrimeDivisorListImpl();
	}

	@Test
	public void testAddForNonNullPrimeInteger() {
		Integer input = 2;
		myList.add(input);

		assertNotNull(myList.get(0));

		assertEquals(input, myList.get(0));

		assertEquals(1, myList.getSize());
	}

	@Test
	public void testAddForOtherPrimes() {
		myList.add(5);
		myList.add(7);
		myList.add(17);
		myList.add(83);
	}

	@Test(expected = NullPointerException.class) 
	public void testAddForNullInteger() {
		Integer input = null;
		myList.add(input);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAddForNonPrimeInteger() {
		Integer input = 4;
		myList.add(input);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAddForNegativeInteger() {
		Integer input = -1;
		myList.add(input);
	}

	@Test
	public void testGetFromOutOfBoundsIndex() {
		myList.add(3);
		myList.add(23);

		Integer output = myList.get(2);

		assertNull(output);
	}

	@Test 
	public void testRemove() {
		myList.add(5);

		Integer output = myList.remove(0);
		Integer expected = 5;
		assertEquals(expected, output);
	}

	@Test
	public void testToString() {
		String expected = "1 + 2^3 + 3 + 23 = 33";

		myList.add(2);
		myList.add(1);
		myList.add(2);
		myList.add(23);
		myList.add(2);
		myList.add(3);

		assertEquals(expected, myList.toString());
	}

}