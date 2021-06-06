package Assignment2;

public abstract class HotelBookingSystem { //2.1 Inheritance & 2.4 Abstraction

	String companyName;
	int year;
	
	HotelBookingSystem(String name, int year){ 
		this.companyName=name;
		this.year=year;
	}
	
	public void printInfo() { //2.2 Polymorphism - method printInfo
		System.out.println("============COMPANY INFO============");
		setCompanyName("Just Go Travel");
		setYear(2010);
		
		System.out.println("Company Name\t: " + getCompanyName()
				+ "\nEstablished Year: " + getYear());
	}
	
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
	
	public abstract void contactUs(); //2.4 Abstraction
}