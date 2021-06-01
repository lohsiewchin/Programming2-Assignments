package Assignment1;
import java.util.*;
public class Employee { //1.3 User Define Class

	//1.2 Pre-Define Class
	Scanner in = new Scanner(System.in);
	String name, email, address, position, medicalhistory;
	int age, salary, contract;
	char gender;
	long hp, employeeID;
	
	public Employee() { //1.4 Constructor with no argument
		employeeInfo();
	}
	
	public Employee(int c) { //1.4 Constructor with one argument
		contract=c;
		employeeInfo();
	}
	
	public Employee(String p, long id) { //1.4 Constructor with two arguments
		position=p;
		employeeID=id;
		employeeInfo();
	}
	
	public void employeeInfo() {
		System.out.println("\n========EMPLOYEE INFORMATION========");
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
		System.out.print("Salary(per month)\t: ");
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
				"\nSalary(per month)\t: RM" + salary);
	}
	
}
