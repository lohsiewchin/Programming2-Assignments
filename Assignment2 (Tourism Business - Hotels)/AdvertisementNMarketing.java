package Assignment2;

public class AdvertisementNMarketing extends HotelBookingSystem{ //2.1 Inheritance
	
	String socialmedia, printmedia;
	
	public AdvertisementNMarketing(String name, int year) {
		super(name, year);
		typeOfAdvertisement();
		printInfo();
	}
	
	public void typeOfAdvertisement() {
		System.out.println("******************ADVERTISEMENT & MARKETING******************");
		System.out.println("We have two types of advertisement."
				+ "\n1. Online advertisement on Social Media"
				+ "\n2. Offline advertisement on Print Media");
	}
	
	public void printInfo() { //2.2 Polymorphism - method printInfo
		System.out.println("\n====================ONLINE ADVERTISEMENT====================");
		setSocialMedia("Facebook");
		System.out.println("Posted on " + getSocialMedia());
		System.out.println("++++++++++++++++++++GIVEAWAY EVENT++++++++++++++++++++");
		System.out.println("Our company is helding a GIVEAWAY event!!!"
				+ "\nYou have a chance to get a 40% discount voucher for booking hotels by just follow these 3 steps!!!"
				+ "\n1st Step\t: Like our page."
				+ "\n2nd Step\t: Like this post and share out this post in public condition."
				+ "\n3nd Step\t: Tag 3 friends in comment and writ down why you want to get this voucher."
				+ "\nLucky winner will win the prize!!!"
				+ "\nThe lucky winner will be announced on 24 June 2021.");
					
		System.out.println("\n====================OFFLINE ADVERTISEMENT====================");
		setPrintMedia("Star Paper");
		System.out.println("Posted on " + getPrintMedia());
		System.out.println("Festival Season is Coming Soon!!!!"
				+ "\nJust come to our webiste and booking for your hotels in anywhere."
				+ "\nWe provide free calcellation and free breakfast for different hotels."
				+ "\n++++++++++++PROMOTION++++++++++++"
				+ "\nYou will get a 10% discount if you have spend over RM3000!!!"
				+ "\nThis promotion only valid until 30 July 2021."
				+ "\nHURRY UP!!! Pls dont miss this amazing promotion!!!"
				+ "\nVisit our website now!!"
				+ "\nWebsite\t: www.jgt.com.my");
		}
	
	//2.3 Encapsulation - Setter methods
	public void setSocialMedia(String socialmedia) {
		this.socialmedia=socialmedia;
	}
	
	public void setPrintMedia(String printmedia) {
		this.printmedia=printmedia;
	}
	
	//2.3 Encapsulation - Getter methods
	public String getSocialMedia() {
		return this.socialmedia;
	}
	
	public String getPrintMedia() {
		return this.printmedia;
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