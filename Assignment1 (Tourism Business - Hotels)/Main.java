package Assignment1;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to UUM Tourism Service - Hotel Booking System.\n");
		
		Hotels u = new Hotels();
		u.UserLogin();
		
		HotelDescription h = new HotelDescription("Penang", "Hotel Eastern & Oriental");
		System.out.println(h);
		
		InventoryNEmployeeNCustomerManagement m = new InventoryNEmployeeNCustomerManagement("Front desk", 12345);
		System.out.println(m);
		
		AdvertisementNMarketing a = new AdvertisementNMarketing("Star Paper", 30);
		System.out.println(a);
		
		Sales s = new Sales(1, 0.10);
		System.out.println(s);
		
		Finance f = new Finance("January", 31);
		System.out.println(f);
		
	}

}
