package Assignment2;

public class Finance extends Sales implements Payment{ //2.1 Inheritance & 2.5 Interface

	double totalIncome, totalExpenditure, monthlyProfit;
	double expensesMaintainance, expensesAdvertisement, wagesEmployee, expensesMiscellaneous;
	double incomeAdvertorial, incomeHotel;
	String month;
	
	public Finance(int q, double d, String m) { 
		super(q,d);
		
		System.out.println("\n\n***************FINANCE**************");
		month=m;
		printInfo();
	}
	
	//2.3 Encapsulation - Setter methods
	public void setExpensesMaintainance(double expensesMaintainance) {
		this.expensesMaintainance=expensesMaintainance;
	}
	
	public void setExpensesAdvertisement(double expensesAdvertisement) {
		this.expensesAdvertisement=expensesAdvertisement;
	}
	
	public void setWagesEmployee(double wagesEmployee) {
		this.wagesEmployee=wagesEmployee;
	}
	
	public void setExpensesMiscellaneous(double expensesMiscellaneous) {
		this.expensesMiscellaneous=expensesMiscellaneous;
	}
	
	public void setIncomeHotel(double incomeHotel) {
		this.incomeHotel=incomeHotel;
	}
	
	public void setIncomeAdvertorial(double incomeAdvertorial) {
		this.incomeAdvertorial=incomeAdvertorial;
	}
	
	//2.3 Encapsulation - Getter methods
	public double getExpensesMaintainance() {
		return this.expensesMaintainance;
	}
	
	public double getExpensesAdvertisement() {
		return this.expensesAdvertisement;
	}
	
	public double getWagesEmployee() {
		return this.wagesEmployee;
	}
	
	public double getExpensesMiscellaneous() {
		return this.expensesMiscellaneous;
	}
	
	public double getIncomeHotel() {
		return this.incomeHotel;
	}
	
	public double getIncomeAdvertorial() {
		return this.incomeAdvertorial;
	}
	
	public double getPayment() { //2.5 Interface
		return 2500;
	}
	
	public void calTotalIncome() {
		setIncomeHotel(87500);
		setIncomeAdvertorial(getPayment());

		totalIncome=incomeHotel+incomeAdvertorial;
		
		System.out.println("==========TOTAL INCOME==========");
		System.out.printf("Income from Hotel Booking\t: RM%.2f" , getIncomeHotel());
		System.out.printf("\nIncome from Advertorial\t\t: RM%.2f" , getIncomeAdvertorial());
		
		System.out.printf("\nThe total income of our company in " + month + " is RM%.2f", totalIncome);
	}
	
	public void calTotalExpenditure() {
		setExpensesMaintainance(5000);
		setExpensesAdvertisement(1050);
		setWagesEmployee(32500);
		setExpensesMiscellaneous(2570);
		
		totalExpenditure=wagesEmployee+expensesMaintainance+expensesAdvertisement+expensesMiscellaneous;
		
		System.out.println("\n\n==========TOTAL EXPENDITURE==========");
		System.out.printf("Maintainance Expenses\t: RM%.2f" , getExpensesMaintainance());
		System.out.printf("\nAdvertisement Expenses\t: RM%.2f" , getExpensesAdvertisement());
		System.out.printf("\nWages Employee\t\t: RM%.2f" , getWagesEmployee());
		System.out.printf("\nMiscellaneous Expenses\t: RM%.2f" , getExpensesMiscellaneous());
		
		System.out.printf("\nThe total expenditure of our company in " + month + " is RM%.2f", totalExpenditure);
	}
	
	public void calNetIncome() {
		System.out.println("\n\n==========TOTAL PROFIT==========");
		System.out.printf("Total Expenditure\t: RM%.2f" , totalExpenditure);
		System.out.printf("\nTotal Income\t\t: RM%.2f" , totalIncome);
				
		monthlyProfit=totalIncome-totalExpenditure;
		System.out.printf("\nThe total profit of our company in " + month + " is RM%.2f", monthlyProfit);
	}
	
	public void printInfo() { //2.2 Polymorphism - method printInfo
		calTotalIncome();
		calTotalExpenditure();
		calNetIncome();
	}

}
