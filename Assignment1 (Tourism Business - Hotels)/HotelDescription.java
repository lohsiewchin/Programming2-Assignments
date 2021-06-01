package Assignment1;
import java.util.*;
public class HotelDescription{ //1.3 User Define Class
	
	//1.2 Pre-define class
	Scanner in = new Scanner(System.in);
	String destination,hotel;
	
	public HotelDescription() { //1.4 Constructor with no argument
		System.out.println("********HOTEL DESCRIPTION********");
		System.out.println("Which destination would you like to travel?"
				+ "\nSelection\t: Johor Penang Perak");
		destination=in.next();
		System.out.println("The selected destination is " + destination);
	}
	
	public HotelDescription(String d) { //1.4 Constructor with one argument
		destination = d;
		
		System.out.println("********HOTEL DESCRIPTION********");
		System.out.println("The selected destination is " + destination);
		System.out.println("The are 2 hotels available in " + destination);
		if (destination == "Johor") {
			HotelsInJohor();
		}
		else if (destination == "Penang") {
			HotelsInPenang();
		}
		else if (destination == "Perak") {
			HotelsInPerak();
		}
	}
	
	public HotelDescription(String d, String h) { //1.4 Constructor with two arguments
		destination=d;
		hotel=h;
		
		System.out.println("********HOTEL DESCRIPTION********");
		System.out.println("The selected destination is " + destination);
		System.out.println("The selected hotel is " + hotel);
		
		if(destination.equals("Johor") && hotel.equals("Impiana Hotel Senai")) {
			Impiana();
		}
		else if (destination.equals("Johor") && hotel.equals("Hotel Legoland Malaysia")) {
			Legoland();
		}
		else if (destination.equals("Penang") && hotel.equals("Hotel Eastern & Oriental")) {
			EandO();
		}
		else if (destination.equals("Penang") && hotel.equals("Bayview Hotel Georgetown Penang")) {
			Bayview();
		}
		else if (destination.equals("Perak") && hotel.equals("D Hotel Seri Iskandar")) {
			DHotel();
		}
		else if (destination.equals("Perak") && hotel.equals("Pangkor Laut Resort")) {
			Pangkor();
		}
		
	}
	
	public void HotelsInJohor() {
		System.out.println("Hotel 1\t: Impiana Hotel Senai" +
				"\nHotel 2\t: Hotel Legoland Malaysia");
		System.out.println("Please enter your selection");
		hotel = in.next();
		System.out.println("The selected hotel is " + hotel);
	}
	
	public void HotelsInPenang() {
		System.out.println("Hotel 1\t: Hotel Eastern & Oriental" + 
				"\nHotel 2\t: Bayview Hotel Georgetown Penang");
		System.out.println("Please enter your selection");
		hotel = in.next();
		System.out.println("The selected hotel is " + hotel);
	}
	
	public void HotelsInPerak() {
		System.out.println("The are 2 hotels available in " + destination);
		System.out.println("Hotel 1\t: D Hotel Seri Iskandar" +
				"\nHotel 2\t: Pangkor Laut Resort");
		System.out.println("Please enter your selection");
		hotel = in.next();
		System.out.println("The selected hotel is " + hotel);
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
				"\n\t\t: Standard rooms, " + 
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
		System.out.println("Placed at Georgetown" +
				"\nRating\t\t: 5 stars" +
				"\nPrice\t\t: RM891 per night" +
				"\nRoom types\t: Standard rooms"+ 
				"\n\t\t: Villas" +
				"\nFree Wifi\t: Y" +
				"\nSwimming Pool\t: Y" +
				"\nRemarks\t\t: Free breakfast");
	}
	
}
