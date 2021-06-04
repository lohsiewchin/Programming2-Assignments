package Assignment2;

public abstract class HotelBookingSystem { //2.1 Inheritance & 2.4 Abstraction

	String companyName;
	int year;
	
	HotelBookingSystem(){ 
		System.out.println("\n============COMPANY INFO============");
		setCompanyName("Just Go Travel");
		setYear(2010);
		
		System.out.println("Company Name\t: " + getCompanyName()
				+ "\nEstablished Year:" + getYear());
		contactUs();
	}
	
	public abstract void printInfo(); //2.2 Polymorphism - method printInfo
	
	//2.3 Encapsulation - Setter methods
	public void setCompanyName(String companyName) {
		this.companyName=companyName;
	}
	
	public void setYear(int year) {
		this.year=year;
	}
	
	//2.3 Encapsulation - Getter methods
	public String getCompanyName() {
		return this.companyName;
	}
	
	public int getYear() {
		return this.year;
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