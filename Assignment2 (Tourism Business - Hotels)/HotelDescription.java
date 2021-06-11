package Assignment2;

public class HotelDescription extends HotelBookingSystem{ //2.1 Inheritance

	String destination,hotel;
	
	public HotelDescription(String name, int year) { 
		super(name, year);
	
		printInfo();
		contactUs();
	}
	
	//2.3 Encapsulation - Setter methods
	public void setDestination(String destination) {
		this.destination=destination;
	}
	
	public void setHotel(String hotel) {
		this.hotel=hotel;
	}
	
	//2.3 Encapsulation - Getter methods
	public String getDestination() {
		return this.destination;
	}
	
	public String getHotel() {
		return this.hotel;
	}
	
	public void printInfo() { //2.2 Polymorphism - method printInfo
		super.printInfo();
		
		setDestination("Penang");
		setHotel("Hotel Eastern & Oriental");
		System.out.println("\n******************HOTEL DESCRIPTION******************");
		System.out.println("The selected destination is " + getDestination());
		System.out.println("The selected hotel is " + getHotel());
		
		if(getDestination()=="Johor") {
			if (getHotel()=="Impiana Hotel Senai") {
				Impiana();
			}
			else if (getHotel()=="Hotel Legoland Malaysia") {
				Legoland();
			}
		}
		else if (getDestination()=="Penang") {
			if (getHotel()=="Hotel Eastern & Oriental") {
				EandO();
			}
			else if (getHotel()=="Bayview Hotel Georgetown Penang") {
				Bayview();
			}
		}
		else if (getDestination()=="Perak") {
			if(getHotel()=="D Hotel Seri Iskandar") {
				DHotel();
			}
			else if (getHotel()=="Pangkor Laut Resort") {
				Pangkor();
			}
		}
	}

	public void Impiana() {
		System.out.println("====================" + 
				"\nImpiana Hotel Senai" +
				"\n====================");
		System.out.println("Placed at 18.7km from city centre" +
				"\nRating\t\t: 4 stars" +
				"\nPrice\t\t: RM147 per night" +
				"\nRoom types\t: Deluxe rooms"+ 
				"\n\t\t: Executive rooms, " + 
				"\n\t\t: Standard rooms, " + 
				"\n\t\t: Suites" +
				"\nFree Wifi\t: Y" +
				"\nSwimming Pool\t: Y" +
				"\nRemarks\t\t: Free cancellation");
	}
	
	public void Legoland() {
		System.out.println("=======================" + 
				"\nHotel Legoland Malaysia" +
				"\n=======================");
		System.out.println("Placed at 14.5km from city centre" +
				"\nRating\t\t: 4 stars" +
				"\nPrice\t\t: RM548 per night" +
				"\nRoom types\t: Deluxe rooms"+ 
				"\n\t\t: Standard rooms " + 
				"\nFree Wifi\t: Y" +
				"\nSwimming Pool\t: Y" +
				"\nRemarks\t\t: Free cancellation" +
				"\n\t\t: Free breakfast");
	}
	
	public void EandO(){
		System.out.println("=========================" + 
				"\nHotel Eastern & Oriental" +
				"\n=========================");
		System.out.println("Placed at Georgetown" +
				"\nRating\t\t: 5 stars" +
				"\nPrice\t\t: RM420 per night" +
				"\nRoom types\t: Comfort rooms"+ 
				"\n\t\t: Deluxe rooms, " + 
				"\n\t\t: Standard rooms, " + 
				"\n\t\t: Studio rooms" +
				"\n\t\t: Suites" +
				"\nFree Wifi\t: Y" +
				"\nSwimming Pool\t: Y" +
				"\nRemarks\t\t: Free breakfast");
	}
	
	public void Bayview() {
		System.out.println("========================" + 
				"\nBayview Hotel Georgetown Penang" +
				"\n========================");
		System.out.println("Placed at Georgetown" +
				"\nRating\t\t: 4 stars" +
				"\nPrice\t\t: RM122 per night" +
				"\nRoom types\t: Comfort rooms"+ 
				"\n\t\t: Deluxe rooms, " + 
				"\n\t\t: Family rooms, " + 
				"\n\t\t: Standard rooms" +
				"\n\t\t: Suites" +
				"\nFree Wifi\t: Y" +
				"\nSwimming Pool\t: Y" +
				"\nRemarks\t\t: Free cancellation"+ 
				"\n\t\t: Pay at the property");
	}
	
	public void DHotel() {
		System.out.println("=====================" + 
				"\nD Hotel Seri Iskandar" +
				"\n=====================");
		System.out.println("Placed at Ipoh" +
				"\nRating\t\t: 3 stars" +
				"\nPrice\t\t: RM160 per night" +
				"\nRoom types\t: Comfort rooms"+ 
				"\n\t\t: Standard rooms" +
				"\nFree Wifi\t: Y" +
				"\nSwimming Pool\t: Y" +
				"\nRemarks\t\t: Free cancellation");
	}
	
	public void Pangkor() {
		System.out.println("====================" + 
				"\nPangkor Laut Resort" +
				"\n====================");
		System.out.println("Placed at 0.5km from the beach" +
				"\nRating\t\t: 5 stars" +
				"\nPrice\t\t: RM891 per night" +
				"\nRoom types\t: Standard rooms"+ 
				"\n\t\t: Villas" +
				"\nFree Wifi\t: Y" +
				"\nSwimming Pool\t: Y" +
				"\nRemarks\t\t: Free breakfast");
	}
	
	public void contactUs() {
		System.out.println("\n==========CONTACT US==========");
		System.out.println("Hotline\t\t: 1300-88-8888"
				+ "\nFax No.\t\t: 04-1357982"
				+ "\nEmail\t\t: jgt2010@gmail.com"
				+ "\nFacebook\t: Just Go Travel"
				+ "\nInstagram\t: @justgotravelll"
				+ "\nTwitter\t\t: @justgotravelll\n");
	}
	
}

