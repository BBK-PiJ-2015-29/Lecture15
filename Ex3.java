/**
 * PiJ Lecture 15 exercise 3
 * @author ocouls01
 */
public class Ex3{
	public static void main(String[] args) {
		Ex3 mine = new Ex3();
		mine.launch();
	}
	
	public void launch() {
		
		boolean invalidSize = true;
		int size = 0;
		System.out.println("Please indicate how many integers you wish to average:");
		System.out.print("> ");
		String input = null;
		while (invalidSize) {
			try{
				input = System.console().readLine();
				int intInput = Integer.parseInt(input);
				size = intInput;
				invalidSize = false;
			} catch (NumberFormatException ex) {
				if (input.toUpperCase().equals("EXIT")) {
					System.exit(0);
				} else {
					System.out.println("Not a valid integer");
				}
			}
		}
		
		int[] list = new int[size];
		
		boolean invalid;
		System.out.println("Please input " + size + " integers");
		input = null;
		for(int i = 0; i < size; i++) {
			invalid = true;
			while(invalid) {
				try {
					if (i == 0){
						System.out.println("Input the first integer:");
						System.out.print("> ");
					} else if (i == size-1) {
						System.out.println("Input the last integer:");
						System.out.print("> ");
					} else {
						System.out.println("Input the next integer:");
						System.out.print("> ");
					}
					input = System.console().readLine();
					int userInput = Integer.parseInt(input);
					list[i] = userInput;
					invalid = false;					
				} catch (NumberFormatException ex) {
					if (input.toUpperCase().equals("EXIT")) {
						System.exit(0);
					} else {
						System.out.println("Not a valid integer, try again");
					}
					
					
				}
			}
		}
		int total = 0;
		for (int i = 0; i < size; i++) {
			total = total + list[i];
		}
		int mean = total / size;
		System.out.println("\nMean Average: " + mean);
		
	}
}