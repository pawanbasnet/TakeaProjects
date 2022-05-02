package nonstaticvari;

import java.util.Scanner;

public class DrinksDetails {
	int amount;
	Scanner sc = new Scanner(System.in);

	void softDrinks() {
		int softprice;
		int cokeprice = 2;
		int pespiprice = 1;
		int spriteprice = 1;

		System.out.println("1. Coke $" + cokeprice);
		System.out.println("2. Pespsi $" + pespiprice);
		System.out.println("3. Back");

		System.out.println("Please select 1 to 2 Soft Drink options");
		int schoice = sc.nextInt();
		switch (schoice) {
		case 1:
			System.out.println("Please enter how many can of Coke do you want :");
			amount = sc.nextInt();
			softprice = amount * cokeprice;
			LunchMenu.total = LunchMenu.total + softprice;
			System.out.println("You total so far is :$" + LunchMenu.total);
			drinkPrice();
			break;
		case 2:
			System.out.println("Please enter how many can of Pepsi do you want :");
			amount = sc.nextInt();
			softprice = amount * pespiprice;
			LunchMenu.total = LunchMenu.total + softprice;
			System.out.println("You total so far is :$" + LunchMenu.total);
			drinkPrice();
			break;
		case 3:
			System.out.println("Please enter how many can of Sprite do you want :");
			amount = sc.nextInt();
			softprice = amount * spriteprice;
			LunchMenu.total = LunchMenu.total + softprice;
			System.out.println("You total so far is :$" + LunchMenu.total);
			drinkPrice();
			break;
		case 4:
			drinkPrice();
			break;
		default:
			System.out.println("Please choose between 1 to 3");
		}
	}

	void hardDrinks() {
		int hardprice;
		int beerprice = 5;
		int shotsprice = 7;
		System.out.println("---------------------------");
		System.out.println("1. Beer $" + beerprice);
		System.out.println("2. Shots $" + shotsprice);
		System.out.println("3. Back");
		System.out.println("");
		
		System.out.println("Please select 1 to 2 Hard Drink options");
		System.out.println("---------------------------------------");
		int schoice = sc.nextInt();
		switch (schoice) {
		case 1:
			System.out.println("Please enter how many Beer do you want :");
			amount = sc.nextInt();
			hardprice = amount * beerprice;
			LunchMenu.total = LunchMenu.total + hardprice;
			System.out.println("You total so far is :$" + LunchMenu.total);
			drinkPrice();
			break;
		case 2:
			System.out.println("Please enter how many shots do you want :");
			amount = sc.nextInt();
			hardprice = amount * shotsprice;
			LunchMenu.total = LunchMenu.total + hardprice;
			System.out.println("You total so far is :$" + LunchMenu.total);
			drinkPrice();
			break;
		case 3:
			drinkPrice();
			break;
		default:
			System.out.println("Please choose between 1 to 3");
			System.out.println("-----------------------------");
		}
	}

	public void drinkPrice() {
		System.out.println("---------------------------");
		System.out.println("1. Soft  Drinks");
		System.out.println("2. Hard  Drinks");
		System.out.println("3. Back");
		System.out.println("");

		System.out.println("Please select 1 to 2 drink option");
		System.out.println("---------------------------------");
		int dchoice = sc.nextInt();
		switch (dchoice) {
		case 1:
			softDrinks();
			break;
		case 2:
			hardDrinks();
			break;
		case 3:
			LunchMenu.main(null);
			break;
		default:
			System.out.println("Please choose between 1 to 3");
			System.out.println("-----------------------------");
			dchoice = sc.nextInt();
		}
	}
}