package Assignment1;
import java.util.*;
public class Sales { //1.3 User Define Class

	//1.2 Pre-Define Class
	Scanner in = new Scanner(System.in);
	int quantity, duration, age;
	double price, discount, totalPrice, finalPrice;
	String destination, hotel, typeOfRoom, name, email, medicalhistory;
	char gender;
	long hp;
	
	public Sales() { //1.4 Constructor with no argument
		customerInfo();
		OrderDetails();
	}
	
	public Sales(int q) { //1.4 Constructor with one argument
		quantity=q;
		customerInfo();
		OrderDetails();
		calTotalPrice();
	}
	
	public Sales(int q, double d) { //1.4 Constructor with two arguments
		quantity=q;
		discount=d;
		customerInfo();
		OrderDetails();
		calTotalPrice();
		calDiscount();
	}
	
	public void customerInfo() {
		System.out.println("========CUSTOMER INFORMATION========");
		System.out.print("Name\t\t:");
		name=in.nextLine();
		System.out.print("Gender\t\t:");
		gender=in.next().charAt(0);
		System.out.print("Age\t\t:");
		age=in.nextInt();
		System.out.print("H/P No.\t\t:");
		hp=in.nextLong();
		System.out.print("Email\t\t:");
		email=in.next();
		in.nextLine();
		System.out.print("Medical History\t:");
		medicalhistory=in.nextLine();
		
		
		System.out.println("\nName\t\t: " + name +
				"\nGender\t\t: " + gender +
				"\nAge\t\t: " + age +
				"\nH/P No.\t\t: " + hp +
				"\nEmail\t\t: " + email +
				"\nMedical History\t: " + medicalhistory);
	}
	
	public void OrderDetails() {
		System.out.println("\n========ORDER DETAILS========");
		System.out.print("Destination\t:");
		destination=in.next();
		in.nextLine();
		System.out.print("Hotel\t\t:");
		hotel=in.nextLine();
		System.out.print("Type of Room\t:");
		typeOfRoom=in.nextLine();
		System.out.print("Price\t\t:");
		price=in.nextDouble();
		System.out.print("Duration\t:");
		duration=in.nextInt();
		System.out.println();
		
		System.out.println("Destination\t:" + destination);
		System.out.println("Hotel\t\t:" + hotel);
		System.out.println("Type of Room\t:" + typeOfRoom);
		System.out.println("Price\t\t:" + price);
		System.out.println("Duration\t:" + duration);
	}
	
	public void calTotalPrice() {
		totalPrice = price*quantity*duration;
		System.out.printf("The price of per " + typeOfRoom + " for " + hotel + " is RM%.2f", price);
		System.out.printf("\nTotal price for " + quantity + " " + typeOfRoom + " for " + hotel + " with " + duration + " night(s) is RM%.2f", totalPrice);
	}
	
	public void calDiscount() {
		if (totalPrice >= 3000) {
			System.out.println("*****CONGRATULATIONS!!! You get a 10% discount on your this time order because of spending over RM3000.*****");
			finalPrice = totalPrice*(1-discount);
			System.out.printf("Your final price after 10 percent discount is RM%.2f", finalPrice);
		}
	}
}
