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

		int year = 0;
		int month = 0;
		int day = 0;
		String name = null;
		int numberPatients = 0;
		boolean invalidNumber = true;
		

		System.out.println("Please indicate how many patients you wish to enter");
		while (invalidNumber) {
			try {
				System.out.print("> ");
				numberPatients = Integer.parseInt(System.console().readLine());
				invalidNumber = false;
			} catch (NumberFormatException ex) {
				System.out.println("Not a valid input");
			}
		}
		boolean validDate = true;
		boolean invalidPatient = true;

		String input = null;
		String[] date = null;

		for (int i = 0; i < numberPatients; i++) {
			while (invalidPatient) {
				System.out.println("Input patient name:");
				System.out.print("> ");
				name = System.console().readLine();
				do {
					System.out.println("Input patient Date of Birth in the format YYYY/M/DD");
					System.out.print("> ");
					input = System.console().readLine();
					date = input.split("/");
					try {
						year = Integer.parseInt(date[0]);
					} catch (NumberFormatException ex) {
						System.out.println("Invalid year");
						validDate = false;
						break;
					}

					try {
						month = Integer.parseInt(date[1]);
		
						} catch (NumberFormatException ex) {
						System.out.println("Invalid month");
						validDate = false;
						break;
					}

					try {
						day = Integer.parseInt(date[2]);
						
					} catch (NumberFormatException ex) {
						System.out.println("Invalid day");
						validDate = false;
						break;
					}
				} while (!validDate);

				try {
					myList.add(new PatientImpl(name, new GregorianCalendar(year, month, day)));
					invalidPatient = false;
				} catch (IllegalArgumentException ex) {
					System.out.println("Invalid date, reinput patient");
				}
			}
				
		}



		/*myList = new ArrayList<Patient>();
		myList.add(new PatientImpl("Tom", new GregorianCalendar(1980, 3, 14)));
		myList.add(new PatientImpl("Danny", new GregorianCalendar(1975, 6, 24)));
		try{
			myList.add(new PatientImpl("Booster", new GregorianCalendar(2016, 6, 24)));
			
		} catch(IllegalArgumentException ex) {
			System.out.println("Invalid date of birth");
			
		}*/

	}
}