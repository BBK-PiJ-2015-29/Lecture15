import java.util.List;
import java.util.LinkedList;

public class Ex2 {
	public static void main(String[] args) {
		Ex2 mine = new Ex2();
		mine.launch();
	}
	
	public void launch() {
		List<Object> myList = new LinkedList<Object>();
		try {
			Object myObj = null;
			myList.add(myObj);
			myList.remove(1);
			
		}
		catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		catch (IndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
}