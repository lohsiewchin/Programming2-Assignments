package Assignment1;

public class AdvertisementNMarketing { //1.3 User Define Class

	//1.2 Pre-Define Class
	String socialmedia, printmedia;
	int area;
	
	public AdvertisementNMarketing() { //1.4 Constructor with no argument
		typeOfAdvertisement();
	}
	
	public AdvertisementNMarketing(String sm) { //1.4 Constructor with one argument
		socialmedia=sm;
		
		onlineAdvertisement();
	}
	
	public AdvertisementNMarketing(String pm, int a) { //1.4 Constructor with two arguments
		printmedia=pm;
		area=a;
		
		offlineAdvertisement();
	}
	
	public void typeOfAdvertisement() {
		System.out.println("We have two types of advertisement."
				+ "\n1. Online advertisement on Social Media"
				+ "\n2. Offline advertisement on Print Media");
	}
	
	public void onlineAdvertisement() {
		System.out.println("====================ONLINE ADVERTISEMENT====================");
		System.out.println("We have posted our advertiseent usch as promotions and product details on " + socialmedia + " evryday.");
	}
	
	public void offlineAdvertisement() {
		System.out.println("====================OFFLINE ADVERTISEMENT====================");
		System.out.println("We have posted our advertisement on " + printmedia + " by size " + area + " cm^2 everyweek once.");
	}
	
	public String toString() {
		return "\n======Contact Us======\nHotline\t: 1300-88-8888\n";
	}
}
