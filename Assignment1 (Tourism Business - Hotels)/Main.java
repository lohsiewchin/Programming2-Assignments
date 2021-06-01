package Assignment1;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to UUM Tourism Service - Hotel Booking System.\n");
		
		HotelBookingSystem b = new HotelBookingSystem("Just Go Travel", 2010);
		
		HotelDescription h = new HotelDescription("Penang", "Hotel Eastern & Oriental");
		
		Employee m = new Employee("Manager", 12345);
		
		AdvertisementNMarketing a = new AdvertisementNMarketing("Facebook");
		
		Sales s = new Sales(1, 0.10);
		
		Finance f = new Finance("January", 31);
		
	}

}
