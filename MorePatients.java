import java.util.List;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class MorePatients{
	private List<Patient> myList;
	public static void main(String[] args) {
		MorePatients my = new MorePatients();
		my.launch();
	}
	
	public void launch() {
		myList = new ArrayList<Patient>();
		myList.add(new PatientImpl("Tom", new GregorianCalendar(1980, 3, 14)));
		myList.add(new PatientImpl("Danny", new GregorianCalendar(1975, 6, 24)));
		
		try{
			myList.add(new PatientImpl("Booster", new GregorianCalendar(2016, 6, 24)));
		} catch(IllegalArgumentException ex) {
			System.out.println("Invalid date of birth");
			ex.printStackTrace();
			//compiles but doesn't find the error. Write JUnit tests to figure out.
		}
	}
}