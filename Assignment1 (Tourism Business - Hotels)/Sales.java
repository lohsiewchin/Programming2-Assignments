package Assignment1;
import java.util.*;
public class Sales { //1.3 User Define Class

	//1.2 Pre-Define Class
	Scanner in = new Scanner(System.in);
	int quantity, duration;
	double price, discount, totalPrice, finalPrice;
	String destination, hotel, typeOfRoom;
	
	public Sales() { //1.4 Constructor with no argument
		OrderDetails();
	}
	
	public Sales(int q) { //1.4 Constructor with one argument
		quantity=q;
		OrderDetails();
		calTotalPrice();
	}
	
	public Sales(int q, double d) { //1.4 Constructor with two arguments
		quantity=q;
		discount=d;
		OrderDetails();
		calTotalPrice();
		calDiscount();
	}
	
	public void OrderDetails() {
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
		
		System.out.println("==========ORDER DETAILS==========");
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
		System.out.println("\nYou will get 10% discount if you have spend over RM3000!");
		if (totalPrice >= 3000) {
			System.out.println("*****CONGRATULATIONS!!! You get a 10% discount on your this time order.*****");
			finalPrice = totalPrice*(1-discount);
			System.out.printf("Your final price after 10 percent discount is RM%.2f", finalPrice);
		}
	}
	
	public String toString() {
		return "\n\n======Contact Us======\nHotline\t: 1300-88-8888\n";
	}
}
