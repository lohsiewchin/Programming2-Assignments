package Assignment2;

public class Main {

	public static void main(String[] args) {
System.out.println("Welcome to UUM Tourism Service - Hotel Booking System.");
		
		HotelDescription h = new HotelDescription("Just Go Travel", 2010);

		Employee m = new Employee("Just Go Travel", 2010, "Manager", 12345);
		
		AdvertisementNMarketing a = new AdvertisementNMarketing("Just Go Travel", 2010);
		
		Finance f = new Finance(2, 0.10, "January");

	}

}
