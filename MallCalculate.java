public class MallCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pizza = 399;
		int cost = pizza * 2;
		float discount = cost * 20 / 100;
		float total = cost - discount;
		System.out.println("Fial cost of the pizza is : $" + total);
	}
}