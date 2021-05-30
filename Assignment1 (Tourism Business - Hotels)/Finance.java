package Assignment1;

public class Finance { //1.3 User Define Class

	//1.2 Pre-Define Class
	double totalIncome, totalExpenditure, monthlyProfit, weeklyProfit, dailyProfit;
	double expensesMaintainance, expensesAdvertisement, wagesEmployee, internetFee, expensesMiscellaneous;
	double incomeJohor, incomePenang, incomePerak;
	String month;
	int days, numOfWeeks;
	
	public Finance() { //1.4 Constructor with no argument
		calTotalIncome();
		calTotalExpenditure();
		calNetIncome();
	}
	
	public Finance(int w) { //1.4 Constructor with one argument
		numOfWeeks=w;
		
		calTotalIncome();
		calTotalExpenditure();
		calNetIncome();
		
		weeklyProfit=monthlyProfit/numOfWeeks;
		
		System.out.println("\n\nThere are " + numOfWeeks + " weeks in this month.");
		System.out.printf("Our weekly income in this month is RM%.2f", weeklyProfit);
	}
	
	public Finance(String m, int d) { //1.4 Constructor with two arguments
		month=m;
		days=d;
		
		calTotalIncome();
		calTotalExpenditure();
		calNetIncome();
		
		dailyProfit=monthlyProfit/days;
		
		System.out.println("\n\nThere are " + days + " days in " + month);
		System.out.printf("Our daily income in " + month + " is RM%.2f", dailyProfit);
		
	}
	
	public void calTotalIncome() {
		incomeJohor=80000;
		incomePenang=95000;
		incomePerak=50000;
		
		totalIncome=incomeJohor+incomePenang+incomePerak;
		
		System.out.printf("\nOur total income in a month is RM%.2f", totalIncome);
	}
	
	public void calTotalExpenditure() {
		wagesEmployee=30000;
		expensesMaintainance=5000;
		expensesAdvertisement=1000;
		internetFee=500;
		expensesMiscellaneous=800;
		
		totalExpenditure=wagesEmployee+expensesMaintainance+expensesAdvertisement+internetFee+expensesMiscellaneous;
		
		System.out.printf("\nOur total expenditure in a month is RM%.2f", totalExpenditure);
	}
	
	public void calNetIncome() {
		monthlyProfit=totalIncome-totalExpenditure;
		System.out.printf("\nOur total profit in a month is RM%.2f", monthlyProfit);
	}
	
	public String toString() {
		return "\n\n======Contact Us======\nHotline\t: 1300-88-8888\n";
	}
	
}
