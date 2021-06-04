package Assignment2;

public abstract class Sales{ //2.1 Inheritance & 2.4 Abstraction

	int quantity, duration, age;
	double price, discount, totalPrice, finalPrice;
	String destination, hotel, typeOfRoom, name, email, medicalhistory, hp;
	char gender;
	
	public Sales(int q, double d) {
		quantity=q;
		discount=d;
		OrderDetails();
		calTotalPrice();
		calDiscount();
	}
	
	public abstract void printInfo(); //2.2 Polymorphism - method printInfo
	
	//2.3 Encapsulation - Setter methods
	public void setName(String name) {
		this.name=name;
	}
	
	public void setGender(char gender) {
		this.gender=gender;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setHP(String hp) {
		this.hp=hp;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public void setMedicalHistory(String medicalhistory) {
		this.medicalhistory=medicalhistory;
	}
	
	public void setDestination(String destination) {
		this.destination=destination;
	}
	
	public void setHotel(String hotel) {
		this.hotel=hotel;
	}
	
	public void setTypeOfRoom(String typeOfRoom) {
		this.typeOfRoom=typeOfRoom;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	public void setDuration(int duration) {
		this.duration=duration;
	}

	//2.3 Encapsulation - Getter methods
	public String getName() {
		return this.name;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getHP() {
		return this.hp;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getMedicalHistory() {
		return this.medicalhistory;
	}
	
	public String getDestination() {
		return this.destination;
	}
	
	public String getHotel() {
		return this.hotel;
	}
	
	public String getTypeOfRoom() {
		return this.typeOfRoom;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getDuration() {
		return this.duration;
	}
	
	public void OrderDetails() {
		setName("Jackson Yee");
		setGender('M');
		setAge(21);
		setHP("0125678321");
		setEmail("fghij@gmail.com");
		setMedicalHistory("N/A");
		System.out.println("\n******************SALES******************");
		System.out.println("========CUSTOMER INFORMATION========");
		System.out.println("Name\t\t: " + getName() +
				"\nGender\t\t: " + getGender() +
				"\nAge\t\t: " + getAge() +
				"\nH/P No.\t\t: " + getHP() +
				"\nEmail\t\t: " + getEmail() +
				"\nMedical History\t: " + getMedicalHistory());
		
		System.out.println("\n========ORDER DETAILS========");
		setDestination("Penang");
		setHotel("Hotel Eastern & Oriental");
		setTypeOfRoom("comfort room");
		setPrice(420);
		setDuration(2);
		
		System.out.println("Destination\t: " + getDestination());
		System.out.println("Hotel\t\t: " + getHotel());
		System.out.println("Type of Room\t: " + getTypeOfRoom());
		System.out.printf("Price\t\t: RM%.2f" , getPrice());
		System.out.println("\nQuantity\t: " + quantity);
		System.out.println("Duration\t: " + getDuration() + " night(s)");
	}
	
	public void calTotalPrice() {
		totalPrice = price*quantity*duration;
		System.out.printf("The price of per " + getTypeOfRoom() + " for " + getHotel() + "per night is RM%.2f", getPrice());
		System.out.printf("\nTotal price for " + quantity + " " + getTypeOfRoom() + " for " + getHotel() + " with " + getDuration() + " night(s) is RM%.2f", totalPrice);
	}
	
	public void calDiscount() {
		if (totalPrice >= 3000) {
			System.out.println("*****CONGRATULATIONS!!! You get a 10% discount on your this time order because of spending over RM3000.*****");
			finalPrice = totalPrice*(1-discount);
			System.out.printf("Your final price after 10 percent discount is RM%.2f", finalPrice);
		}
	}
}