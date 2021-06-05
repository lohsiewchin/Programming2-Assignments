package Assignment2;

public class Main {

	public static void main(String[] args) {
System.out.println("Welcome to UUM Tourism Service - Hotel Booking System.");
		
		HotelDescription h = new HotelDescription();

		Employee m = new Employee("Manager", 12345);
		
		AdvertisementNMarketing a = new AdvertisementNMarketing();
		
		Finance f = new Finance(2, 0.10, "January");

	}

}
