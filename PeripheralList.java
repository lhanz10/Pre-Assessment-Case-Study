package preAssessment;
import java.util.*;
public class PeripheralList {
	static Scanner input = new Scanner(System.in); // declaring these outside the main method so it can be accessed anywhere in the class
	
	static ArrayList <Peripheral>list = new ArrayList<>(); // using ArrayList to store multiple objects
	public static void add(Peripheral p) {
		list.add(p);
		System.out.println("Successfully Added");
		
	}
	public static Peripheral delete(int n) {
		Peripheral removed = list.get(n);
		list.remove(removed);
		
		return removed;
	}
	
	
	public static void main (String []args ) {
		int number=0;
		String code="", name="", peripheral="", assignedTo="";
		boolean condition = true;
		
		System.out.println("COMPUTER SYSTEM INVENTORY");
		while (condition) { // creating a loop so that the system menu will be iterated until user chooses to stop it
			
		System.out.println("\nSYSTEM MENU\n");
		System.out.println("a. Add");
		System.out.println("b. View");
		System.out.println("c. Edit");
		System.out.println("d. Delete");
		System.out.println("e. Report");
		System.out.println(" f. Exit");
		System.out.print("Enter option >>");
		char option= input.next().charAt(0);
		
		
		if (option=='a' |option== 'A') {
			System.out.println("Enter Code: ");
			code = input.next();
			input.nextLine();
			System.out.println("Enter Name: ");
			name = input.nextLine();
			
			System.out.println("Enter Peripheral: ");
			peripheral = input.nextLine();
			
			System.out.println("Assigned To: ");
			assignedTo = input.nextLine();
			number++;
			Peripheral p = new Peripheral(number, code, name, peripheral, assignedTo);
			list.add(p);
			System.out.println("\nAdded Successfully");
			
		}
		else if(option =='b' | option== 'B') {
			if(list.size()>=1) {
				for(int i=0; i<list.size();i++) {
					System.out.println(list.get(i).toString());
					
				}
				
			}else {
				System.out.println("List Empty");
			}
		}else if (option== 'c' | option== 'C') {
			
		}else if (option== 'd' | option== 'D') {
			System.out.println("Enter the number of the Peripheral to be Deleted: ");
			int num = input.nextInt();
			list.remove(number-1);
			
		}else if (option== 'e' | option== 'E') {
			
		}else if (option== 'f' |option== 'F') {
			condition = false;
		}else {
			System.out.println("Please input the correct character.");
		}
		}
	}
}



