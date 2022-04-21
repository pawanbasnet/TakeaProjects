package nonstaticvari;

import java.util.Scanner;

public class BiryaniDetails {
	 int cbiryani = 10;
	 int vbiryani = 5;
	 int fbiryani = 5;
	 int amount;
	int biryanicost;
	Scanner sc = new Scanner(System.in);

	public void biryaniPrice() {			
		System.out.println("---------------------------");
		System.out.println("1. Chicken Biryani $" + cbiryani);
		System.out.println("2. Veggy Biryani $" + vbiryani);
		System.out.println("3. Fish Biryani :" + fbiryani);
		System.out.println("4. Back");
		System.out.println("");

		System.out.println("Please select 1 to 4 Biyani option");
		System.out.println("----------------------------------");
		int bchoice = sc.nextInt();
		switch (bchoice) {
			case 1:
				System.out.println("Please enter how many Chicken Biryani you want :");
				amount = sc.nextInt();
				biryanicost = amount * cbiryani;
				LunchMenu.total = LunchMenu.total + biryanicost;
				System.out.println("You total so far is :$"+  LunchMenu.total);
				break;
			case 2:
				System.out.println("Please enter how many Veggy Biryani you want :$");
				amount = sc.nextInt();
				biryanicost = amount * vbiryani;
				LunchMenu.total = LunchMenu.total + biryanicost;
				System.out.println("You total so far is :"+  LunchMenu.total);
				break;
			case 3:
				System.out.println("Please enter how many Veggy Biryani you want :$");
				amount = sc.nextInt();
				biryanicost = amount * fbiryani;
				LunchMenu.total = LunchMenu.total + biryanicost;
				System.out.println("You total so far is :"+  LunchMenu.total);
				break;
			case 4:
			default:
				System.out.println("Please choose between 1 to 4");
				bchoice = sc.nextInt();
		}
	}
}
