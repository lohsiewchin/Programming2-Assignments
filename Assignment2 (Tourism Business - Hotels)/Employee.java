package Assignment2;

public class Employee extends HotelBookingSystem implements Payment{ //2.1 Inheritance & 2.5 Interface
	
	String name, email, address, position, medicalhistory, hp;
	int age, contract, employeeID;
	char gender;
	double salary;
	
	public Employee(String p, int id) { 
		super();
		
		System.out.println("***************EMPLOYEE***************");
		position=p;
		employeeID=id;
		printInfo();
	}
	
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
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	public void setMedicalHistory(String medicalhistory) {
		this.medicalhistory=medicalhistory;
	}
	
	public void setPosition(String position) {
		this.position=position;
	}
	
	public void setContract(int contract) {
		this.contract=contract;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
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
	
	public String getAddress() {
		return this.address;
	}
	
	public String getMedicalHistory() {
		return this.medicalhistory;
	}
	
	public String getPosition() {
		return this.position;
	}
	
	public int getContract() {
		return this.contract;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public double getPayment() { //2.5 Interface
		return 5000;
	}
	
	public void printInfo() { //2.2 Polymorphism - method printInfo
		setName("Loh Siew Chin");
		setGender('F');
		setAge(21);
		setHP("0123456789");
		setEmail("abcde@gmail.com");
		setAddress("123, Jalan Emas, 11500 Pulau Pinang");
		setMedicalHistory("N/A");
		setPosition("Manager");
		setContract(2);
		setSalary(getPayment());
		
		System.out.println("========EMPLOYEE INFORMATION========");
		System.out.println(
				"Name\t\t\t: " + getName() +
				"\nGender\t\t\t: " + getGender() +
				"\nAge\t\t\t: " + getAge() +
				"\nH/P No.\t\t\t: " + getHP() +
				"\nEmail\t\t\t: " + getEmail() +
				"\nAddress\t\t\t: " + getAddress() +
				"\nMedical History\t\t: " + getMedicalHistory() +
				"\nPosition\t\t: " + getPosition() +
				"\nDuration of contract\t: " + getContract() + " year(s)");
		System.out.printf("Salary(per month)\t: RM%.2f" , getSalary());
		System.out.println();
	}

}