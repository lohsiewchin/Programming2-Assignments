package Assignment1;

public class HotelBookingSystem { //1.3 User Define Class

	//1.2 Pre-Define Class
	String companyName;
	int year;
	
	HotelBookingSystem(){ //1.4 Constructor with no argument
		getName();
	}
	
	HotelBookingSystem(String n){ //1.4 Constructor with one argument
		companyName=n;
		getName();
		
	}
	
	HotelBookingSystem(String n, int y){ //1.4 Constructor with two arguments
		companyName=n;
		year=y;
		CompanyInfo();
		contactUs();
	}
	
	public String getName() {
		return "Company Name\t: " + companyName;
	}
	
	public void CompanyInfo() {
		System.out.println("*************COMPANY INFO***************");
		System.out.println("Company Name\t: " + companyName);
		System.out.println("Address\t\t: 123, Jalan Emas, 11888 Bayan Lepas, Pulau Pinang"
				+ "\nEstablished Year: " + year 
				+ "\nAwards\t\t: Winner of Hotel Tech Awards in 2018"
				+ "\nWebsite\t\t: www.jgt.com.my");
		
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
