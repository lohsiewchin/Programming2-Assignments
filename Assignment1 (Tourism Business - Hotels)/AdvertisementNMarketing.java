package Assignment1;

public class AdvertisementNMarketing { //1.3 User Define Class

	//1.2 Pre-Define Class
	String socialmedia, printmedia;
	int discount;
	
	public AdvertisementNMarketing() { //1.4 Constructor with no argument
		typeOfAdvertisement();
	}
	
	public AdvertisementNMarketing(String sm) { //1.4 Constructor with one argument
		socialmedia=sm;
		
		onlineAdvertisement();
	}
	
	public AdvertisementNMarketing(String pm, int d) { //1.4 Constructor with two arguments
		printmedia=pm;
		discount=d;
		
		offlineAdvertisement();
	}
	
	public void typeOfAdvertisement() {
		System.out.println("\nWe have two types of advertisement."
				+ "\n1. Online advertisement on Social Media"
				+ "\n2. Offline advertisement on Print Media\n");
	}
	
	public void onlineAdvertisement() {
		System.out.println("\n====================ONLINE ADVERTISEMENT====================");
		System.out.println("Posted on " + socialmedia);
		System.out.println("********************GIVEAWAY EVENT******************");
		System.out.println("Our company is helding a GIVEAWAY event!!!"
				+ "\nYou have a chance to get a 40% discount voucher for booking hotels by just follow these 3 steps!!!"
				+ "\n1st Step\t: Like our page."
				+ "\n2nd Step\t: Like this post and share out this post in public condition."
				+ "\n3nd Step\t: Tag 3 friends in comment and writ down why you want to get this voucher."
				+ "\nLucky winner will win the prize!!!"
				+ "\nThe lucky winner will be announced on 24 June 2021.\n");
	}
	
	public void offlineAdvertisement() {
		System.out.println("\n====================OFFLINE ADVERTISEMENT====================");
		System.out.println("Posted on " + printmedia);
		System.out.println("Festival Season is Coming Soon!!!!"
				+ "\nJust come to our webiste and booking for your hotels in anywhere."
				+ "\nWe provide free calcellation and free breakfast for different hotels."
				+ "\n***********PROMOTION***********"
				+ "\nYou will get a " + discount + "% discount if you have spend over RM3000!!!"
				+ "\nThis promotion only valid until 30 July 2021."
				+ "\nHURRY UP!!! Pls dont miss this amazing promotion!!!"
				+ "\nVisit our website now!!"
				+ "\nWebsite\t: www.jgt.com.my\n");
	}
	
}
