package Assignment1;
import java.util.*;
public class InventoryNEmployeeNCustomerManagement { //1.3 User Define Class

	//1.2 Pre-Define Class
	Scanner in = new Scanner(System.in);
	String name, email, address, position, medicalhistory;
	int age, quantity, TotalnumRoom, availableroom, salary, contract;
	char gender;
	long hp, employeeID;
	
	public InventoryNEmployeeNCustomerManagement() { //1.4 Constructor with no argument
		customerInfo();
	}
	
	public InventoryNEmployeeNCustomerManagement(int q) { //1.4 Constructor with one argument
		quantity=q;
		inventoryInfo();
	}
	
	public InventoryNEmployeeNCustomerManagement(String p, long id) { //1.4 Constructor with two arguments
		position=p;
		employeeID=id;
		employeeInfo();
	}
	
	public void customerInfo() {
		System.out.println("========CUSTOMER INFORMATION========");
		System.out.print("Name\t:");
		name=in.nextLine();
		System.out.print("Gender\t:");
		gender=in.next().charAt(0);
		System.out.print("Age\t:");
		age=in.nextInt();
		System.out.print("H/P No.\t:");
		hp=in.nextLong();
		System.out.print("Email\t:");
		email=in.next();
		in.nextLine();
		System.out.print("Medical History\t:");
		medicalhistory=in.nextLine();
		
		
		System.out.println("\nName\t: " + name +
				"\nGender\t: " + gender +
				"\nAge\t: " + age +
				"\nH/P No.\t: " + hp +
				"\nEmail\t: " + email +
				"\nMedical History\t: " + medicalhistory);
	}
	
	public void inventoryInfo() {
		System.out.println("========INVENTORY INFORMATION========");
		int TotalnumRoom=10000;
		System.out.println("The total number of rooms is " + TotalnumRoom + " of  rooms.");
		System.out.println("The number of rooms are reserved today is " + quantity + " of  rooms.");
		int availableroom=TotalnumRoom-quantity;
		System.out.println("The number of rooms available now is " + availableroom + " of rooms.");
	}
	
	public void employeeInfo() {
		System.out.println("========EMPLOYEE INFORMATION========");
		System.out.print("Name\t\t\t: ");
		name=in.nextLine();
		System.out.print("Gender\t\t\t: ");
		gender=in.next().charAt(0);
		System.out.print("Age\t\t\t: ");
		age=in.nextInt();
		System.out.print("H/P No.\t\t\t: ");
		hp=in.nextLong();
		System.out.print("Email\t\t\t: ");
		email=in.next();
		in.nextLine();
		System.out.print("Address\t\t\t: ");
		address=in.nextLine();
		System.out.print("Medical History\t\t: ");
		medicalhistory=in.nextLine();
		System.out.print("Position\t\t: ");
		position=in.nextLine();
		System.out.print("Duration of contract\t: ");
		contract=in.nextInt();
		System.out.print("Salary\t\t\t: ");
		salary=in.nextInt();
		
		System.out.println("\nName\t\t\t: " + name +
				"\nGender\t\t\t: " + gender +
				"\nAge\t\t\t: " + age +
				"\nH/P No.\t\t\t: " + hp +
				"\nEmail\t\t\t: " + email +
				"\nAddress\t\t\t: " + address +
				"\nMedical History\t\t: " + medicalhistory +
				"\nPosition\t\t: " + position +
				"\nDuration of contract\t: " + contract + " year(s)" +
				"\nSalary\t\t\t: RM" + salary);
	}
	
	public String toString() {
		return "\n======Contact Us======\nHotline\t: 1300-88-8888\n";
	}
}
