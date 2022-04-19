
public class HimaSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary = 85000;
		float ta = salary * 15 / 100;
		float da = salary * 20 / 100;
		float hra = salary * 18 / 100;
		
		float tax = salary * 25 / 100;
		float pf = salary * 20 / 100;
		
		float amount = salary + ta + da + hra;
		System.out.println("The Gross Salary is: $" + amount);
		System.out.println("The Net Salary is: $" + (amount-pf-tax));
	}

}
