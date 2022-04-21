package nonstaticvari;

import java.util.*;

public class DessertDetails {

	int van = 3;
	int choco = 5;
	int amount;
	int dessertcost;
	Scanner sc = new Scanner(System.in);

	public void dessertPrice() {
		System.out.println("---------------------------");
		System.out.println("1. Vanilla $" + van);
		System.out.println("2. Chocolate $" + choco);
		System.out.println("4. Back");
		System.out.println("");

		System.out.println("Please select 1 to 2 Dessert option");
		System.out.println("----------------------------------");
		int bchoice = sc.nextInt();
		switch (bchoice) {
		case 1:
			System.out.println("Please enter how many scoops of Vanilla you want :");
			amount = sc.nextInt();
			dessertcost = amount * van;
			LunchMenu.total = LunchMenu.total + dessertcost;
			System.out.println("You total so far is :$" + LunchMenu.total);
			break;
		case 2:
			System.out.println("Please enter how many  scoops of Chocolate you want :$");
			amount = sc.nextInt();
			dessertcost = amount * choco;
			LunchMenu.total = LunchMenu.total + dessertcost;
			System.out.println("You total so far is :" + LunchMenu.total);
			break;
		case 3:
		default:
			System.out.println("Please choose between 1 to 3");
			bchoice = sc.nextInt();
		}
	}
}